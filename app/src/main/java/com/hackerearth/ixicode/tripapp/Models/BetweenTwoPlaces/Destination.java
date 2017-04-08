
package com.hackerearth.ixicode.tripapp.Models.BetweenTwoPlaces;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Destination {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("id")
    private Long mId;
    @SerializedName("lat")
    private Double mLat;
    @SerializedName("lng")
    private Double mLng;
    @SerializedName("mongoId")
    private String mMongoId;
    @SerializedName("name")
    private String mName;
    @SerializedName("state")
    private String mState;
    @SerializedName("xid")
    private Long mXid;

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Double getLat() {
        return mLat;
    }

    public void setLat(Double lat) {
        mLat = lat;
    }

    public Double getLng() {
        return mLng;
    }

    public void setLng(Double lng) {
        mLng = lng;
    }

    public String getMongoId() {
        return mMongoId;
    }

    public void setMongoId(String mongoId) {
        mMongoId = mongoId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public Long getXid() {
        return mXid;
    }

    public void setXid(Long xid) {
        mXid = xid;
    }

}
