package vardemin.com.jetrshots;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import vardemin.com.jetrshots.models.Shot;
import vardemin.com.jetrshots.util.PicassoCache;

/**
 * Created by xavie on 12.02.2017.
 */

public class ShotsAdapter extends RecyclerView.Adapter<ShotsAdapter.ShotsViewHolder> {

    List<Shot> shots;
    Context ctx;

    public ShotsAdapter(List<Shot> shots) {
        this.shots = shots;
    }


    @Override
    public ShotsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shot, parent, false);
        ctx = parent.getContext();
        return new ShotsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ShotsViewHolder holder, int position) {
        Shot shot = shots.get(position);
        holder.title.setText(shot.getTitle());
        holder.description.setText(shot.getDescription());
        PicassoCache.getPicassoInstance(ctx)
                .load(shot.getImageUrl())
                .into(holder.image);


    }

    @Override
    public int getItemCount() {
        return shots.size();
    }

    class ShotsViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        ImageView image;
        TextView title;
        TextView description;

         ShotsViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.shot_cv);
            image = (ImageView)itemView.findViewById(R.id.shot_item_img);
            title = (TextView) itemView.findViewById(R.id.shot_item_header);
            description = (TextView)itemView.findViewById(R.id.shot_item_desc);
        }
    }
}
