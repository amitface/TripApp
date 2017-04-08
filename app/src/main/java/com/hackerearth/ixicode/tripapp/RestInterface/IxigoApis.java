package com.hackerearth.ixicode.tripapp.RestInterface;

import com.hackerearth.ixicode.tripapp.Models.TrendingPlaces.TrendingPlacesModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by amit on 8/4/17.
 */

public interface IxigoApis {

    @GET("api/v2/widgets/brand/inspire?product=1&apiKey=ixicode!2$")
    Call<TrendingPlacesModel> getTrends();
}
