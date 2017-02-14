package vardemin.com.jetrshots;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Debug;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.realm.Realm;
import io.realm.Sort;
import vardemin.com.jetrshots.models.Shot;
import vardemin.com.jetrshots.util.ShotJSONParser;
import vardemin.com.jetrshots.util.UrlUtil;

public class ShotListingActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private int page = 1;
    private Realm realm;
    private List<Shot> shots;

    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView rv;
    private ShotsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shot_listing);

        //Layout init
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.activity_shot_listing);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        rv=(RecyclerView)findViewById(R.id.shots_recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true);

        //Data init
        realm = Realm.getDefaultInstance();
        shots = new ArrayList<>();
        shots.addAll(realm.where(Shot.class).findAllSorted("createdAt", Sort.DESCENDING));
        //page = 1 + shots.size()/50;
        adapter = new ShotsAdapter(shots);
        rv.setAdapter(adapter);
        if(isOnline())
            onRefresh();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }
    @Override
    public void onRefresh() {
        if (isOnline()) {
            HashMap<String, String> map = new HashMap<String, String>() {{
                put("access_token", getString(R.string.access_token));
                put("page", String.valueOf(page));
                put("per_page", String.valueOf("50"));
                put("sort", "recent");
            }};
            String url = UrlUtil.getUrl("https://api.dribbble.com/v1","shots", map);
            JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
                @Override
                public void onResponse(JSONArray response) {
                    Log.d("OnJSONRequest","GOT : " + response.toString());
                    Update(ShotJSONParser.parseData(response));
                    mSwipeRefreshLayout.setRefreshing(false);
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    VolleyLog.d("JetRShots", "Error: " + error.getMessage());
                    Toast.makeText(getApplicationContext(),
                            error.getMessage(), Toast.LENGTH_SHORT).show();
                    mSwipeRefreshLayout.setRefreshing(false);
                }
            });
            Volley.newRequestQueue(this).add(jsonArrayRequest);
        }
        else {
            mSwipeRefreshLayout.setRefreshing(false);
            Toast.makeText(this,R.string.check_internet_con, Toast.LENGTH_SHORT).show(); }

    }

    /**
     * Update DB and notify adapter
     * @param shots new Shots List
     */
    private void Update(List<Shot> shots) {
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(shots);
        realm.commitTransaction();
        this.shots.clear();
        this.shots.addAll(realm.where(Shot.class).findAllSorted("createdAt", Sort.DESCENDING));
        //page = 1 + this.shots.size()/50;
        adapter.notifyDataSetChanged();
        rv.smoothScrollToPosition(0);
    }

    /**
     * Check Internet Connection
     * @return whether online
     */
    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null &&
                cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }
}
