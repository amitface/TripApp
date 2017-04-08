
package com.hackerearth.ixicode.tripapp.Models.DetailOfEntity;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Data {

    @SerializedName("categoryNames")
    private List<String> mCategoryNames;
    @SerializedName("countryName")
    private String mCountryName;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("id")
    private String mId;
    @SerializedName("keyImageUrl")
    private String mKeyImageUrl;
    @SerializedName("latitude")
    private Double mLatitude;
    @SerializedName("longitude")
    private Double mLongitude;
    @SerializedName("name")
    private String mName;
    @SerializedName("shortDescription")
    private String mShortDescription;
    @SerializedName("stateName")
    private String mStateName;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("whyToVisit")
    private String mWhyToVisit;
    @SerializedName("xid")
    private Long mXid;

    public List<String> getCategoryNames() {
        return mCategoryNames;
    }

    public void setCategoryNames(List<String> categoryNames) {
        mCategoryNames = categoryNames;
    }

    public String getCountryName() {
        return mCountryName;
    }

    public void setCountryName(String countryName) {
        mCountryName = countryName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getKeyImageUrl() {
        return mKeyImageUrl;
    }

    public void setKeyImageUrl(String keyImageUrl) {
        mKeyImageUrl = keyImageUrl;
    }

    public Double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(Double latitude) {
        mLatitude = latitude;
    }

    public Double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(Double longitude) {
        mLongitude = longitude;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getShortDescription() {
        return mShortDescription;
    }

    public void setShortDescription(String shortDescription) {
        mShortDescription = shortDescription;
    }

    public String getStateName() {
        return mStateName;
    }

    public void setStateName(String stateName) {
        mStateName = stateName;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getWhyToVisit() {
        return mWhyToVisit;
    }

    public void setWhyToVisit(String whyToVisit) {
        mWhyToVisit = whyToVisit;
    }

    public Long getXid() {
        return mXid;
    }

    public void setXid(Long xid) {
        mXid = xid;
    }

}
