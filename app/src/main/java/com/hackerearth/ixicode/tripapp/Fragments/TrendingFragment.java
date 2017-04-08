package com.hackerearth.ixicode.tripapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hackerearth.ixicode.tripapp.Adapters.TrendingAdapter1;
import com.hackerearth.ixicode.tripapp.Adapters.TrendingAdapter2;
import com.hackerearth.ixicode.tripapp.Models.TrendingPlaces.BudgetFlight;
import com.hackerearth.ixicode.tripapp.Models.TrendingPlaces.Flight;
import com.hackerearth.ixicode.tripapp.Models.TrendingPlaces.TrendingPlacesModel;
import com.hackerearth.ixicode.tripapp.R;
import com.hackerearth.ixicode.tripapp.RestInterface.IxigoApis;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TrendingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TrendingFragment extends Fragment implements Callback<TrendingPlacesModel> {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private final String BASE_URL = "http://build2.ixigo.com/";

    @InjectView(R.id.recyclerTrending1)
    RecyclerView recyclerTrending1;
    @InjectView(R.id.recyclerTrending2)
    RecyclerView recyclerTrending2;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TrendingAdapter1 trendingAdapter1;
    private TrendingAdapter2 trendingAdapter2;

    private List<Flight> flightList;
    private List<BudgetFlight> budgetFlights;

    public TrendingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TrendingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TrendingFragment newInstance(String param1, String param2) {
        TrendingFragment fragment = new TrendingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trending, container, false);
        ButterKnife.inject(this, view);
        setRecycler();
        setUI();
        return view;
    }

    private void setRecycler() {

        budgetFlights = new ArrayList<>();
        flightList = new ArrayList<>();
        trendingAdapter1 = new TrendingAdapter1(this, flightList);
        trendingAdapter2 = new TrendingAdapter2(this, budgetFlights);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
        recyclerTrending1.setLayoutManager(layoutManager1);
        recyclerTrending1.setItemAnimator(new DefaultItemAnimator());
        recyclerTrending1.setAdapter(trendingAdapter1);

        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getActivity());
        recyclerTrending2.setLayoutManager(layoutManager2);
        recyclerTrending2.setItemAnimator(new DefaultItemAnimator());
        recyclerTrending2.setAdapter(trendingAdapter2);
    }

    private void setUI() {


        Gson gson = new GsonBuilder().setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        IxigoApis ixigoApis = retrofit.create(IxigoApis.class);

        Call<TrendingPlacesModel> call = ixigoApis.getTrends();
        call.enqueue(this);
    }

    /*@Override
    public void onResponse(Call<PlayerListModel> call, Response<PlayerListModel> response) {
        records.addAll(response.body().getRecords());
        playerListAdapter.notifyDataSetChanged();
    }

    @Override
    public void onFailure(Call<PlayerListModel> call, Throwable t) {
        Toast.makeText(getActivity(),"error",Toast.LENGTH_LONG).show();
    }*/

    @Override
    public void onResponse(Call<TrendingPlacesModel> call, Response<TrendingPlacesModel> response) {
        flightList.addAll(response.body().getData().getFlight());
        budgetFlights.addAll(response.body().getData().getBudgetFlight());
        trendingAdapter1.notifyDataSetChanged();
        trendingAdapter2.notifyDataSetChanged();
    }

    @Override
    public void onFailure(Call<TrendingPlacesModel> call, Throwable t) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
