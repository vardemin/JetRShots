package vardemin.com.jetrshots.util;

import android.text.Html;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import vardemin.com.jetrshots.models.Shot;

/**
 * Created by xavie on 12.02.2017.
 */

public class ShotJSONParser {
    static List<Shot> shotList;

    /**
     * Parse JSONArray to Shots list
     * @param shot_array input JSONArray
     * @return Shots list
     */
    public static List<Shot> parseData(JSONArray shot_array) {

        Shot shot = null;
        try {

            shotList = new ArrayList<>();

            for (int i = 0; i < shot_array.length(); i++) {

                JSONObject obj = shot_array.getJSONObject(i);
                if (obj.getBoolean("animated"))
                    continue;
                shot = new Shot();

                shot.setId(obj.getInt("id"));
                shot.setTitle(obj.getString("title"));
                if (!obj.isNull("description"))
                    shot.setDescription(Html.fromHtml(obj.getString("description")).toString());
                else shot.setDescription("");
                String createdAt = obj.getString("created_at");
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                shot.setCreatedAt(format.parse(createdAt));
                JSONObject images = obj.getJSONObject("images");
                shot.setImageUrl(images.isNull("hidpi")?images.getString("normal"):images.getString("hidpi"));

                shotList.add(shot);
            }
            return shotList;

        }
        catch (JSONException ex) {
            ex.printStackTrace();
            return null;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Parse json string to Shots list
     * @param json input string
     * @return Shots List
     */
    public static List<Shot> parseData(String json) {

        Shot shot = null;
        try {

            shotList = new ArrayList<>();
            JSONArray shot_array = new JSONArray(json);

            for (int i = 0; i < shot_array.length(); i++) {

                JSONObject obj = shot_array.getJSONObject(i);
                if (obj.getBoolean("animated"))
                    continue;
                shot = new Shot();

                shot.setId(obj.getInt("id"));
                shot.setTitle(obj.getString("title"));
                if (!obj.isNull("description"))
                    shot.setDescription(Html.fromHtml(obj.getString("description")).toString());
                else shot.setDescription("");
                String createdAt = obj.getString("created_at");
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                shot.setCreatedAt(format.parse(createdAt));
                JSONObject images = obj.getJSONObject("images");
                shot.setImageUrl(images.isNull("hidpi")?images.getString("normal"):images.getString("hidpi"));

                shotList.add(shot);
            }
            return shotList;

        }
        catch (JSONException ex) {
            ex.printStackTrace();
            return null;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
