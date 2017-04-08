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
import com.hackerearth.ixicode.tripapp.Models.TrendingPlaces.BudgetFlight;
import com.hackerearth.ixicode.tripapp.R;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by amit on 8/4/17.
 */

public class TrendingAdapter2 extends RecyclerView.Adapter<TrendingAdapter2.MyViewHolder> {


    private Context context;
    private List<BudgetFlight> budgetFlights;

    public TrendingAdapter2(Fragment trendingFragment, List<BudgetFlight> budgetFlights) {
        context = trendingFragment.getContext();
        this.budgetFlights = budgetFlights;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @InjectView(R.id.imageTrendingAdapter2)
        ImageView imageTrendingAdapter2;
        @InjectView(R.id.layoutTrendingAdapter2)
        FrameLayout layoutTrendingAdapter2;
        @InjectView(R.id.tvTrendingAdapter2Name)
        TextView tvTrendingAdapter2Name;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this,itemView);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_trending_2, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BudgetFlight temp = budgetFlights.get(position);
        holder.imageTrendingAdapter2.setImageBitmap(null);
        Glide.with(context).load(temp.getImage()).crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.imageTrendingAdapter2);//.thumbnail(0.5f)
        holder.tvTrendingAdapter2Name.setText(temp.getName());
    }

    @Override
    public int getItemCount() {
        return budgetFlights.size();
    }
}
