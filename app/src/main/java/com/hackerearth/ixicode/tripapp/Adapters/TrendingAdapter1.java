package com.hackerearth.ixicode.tripapp.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.hackerearth.ixicode.tripapp.Models.TrendingPlaces.Flight;
import com.hackerearth.ixicode.tripapp.R;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by amit on 8/4/17.
 */

public class TrendingAdapter1 extends RecyclerView.Adapter<TrendingAdapter1.MyViewHolder> {


    private Context context;
    private List<Flight> flightList;

    public TrendingAdapter1(Fragment context, List<Flight> flightList) {
        this.context = context.getContext();
        this.flightList = flightList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @InjectView(R.id.imageTrendingAdapter1)
        ImageView imageTrendingAdapter1;
        @InjectView(R.id.layoutTrendingAdapter1)
        FrameLayout layoutTrendingAdapter1;
        @InjectView(R.id.tvTrendingAdapter1Name)
        TextView tvTrendingAdapter1Name;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this,itemView);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_trending_adapter1, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Flight temp = flightList.get(position);
        holder.imageTrendingAdapter1.setImageBitmap(null);
        Glide.with(context).load(temp.getImage()).crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.imageTrendingAdapter1);//.thumbnail(0.5f)
        holder.tvTrendingAdapter1Name.setText(temp.getName());
    }

    @Override
    public int getItemCount() {
        return flightList.size();
    }
}
