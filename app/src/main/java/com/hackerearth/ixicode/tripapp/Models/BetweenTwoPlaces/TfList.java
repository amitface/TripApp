
package com.hackerearth.ixicode.tripapp.Models.BetweenTwoPlaces;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class TfList {

    @SerializedName("classType")
    private String mClassType;
    @SerializedName("fare")
    private Long mFare;

    public String getClassType() {
        return mClassType;
    }

    public void setClassType(String classType) {
        mClassType = classType;
    }

    public Long getFare() {
        return mFare;
    }

    public void setFare(Long fare) {
        mFare = fare;
    }

}
