package com.hackerearth.ixicode.tripapp.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hackerearth.ixicode.tripapp.Models.TrendingPlaces.BudgetFlight;
import com.hackerearth.ixicode.tripapp.R;

import java.util.List;

/**
 * Created by amit on 8/4/17.
 */

public class TrendingAdapter2 extends RecyclerView.Adapter<TrendingAdapter2.MyViewHolder>{

    private Context context;
    private List<BudgetFlight> budgetFlights;

    public TrendingAdapter2(Fragment trendingFragment, List<BudgetFlight> budgetFlights) {
        context = trendingFragment.getContext();
        this.budgetFlights = budgetFlights;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_trending_2,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BudgetFlight temp = budgetFlights.get(position);
    }

    @Override
    public int getItemCount() {
        return budgetFlights.size();
    }
}
