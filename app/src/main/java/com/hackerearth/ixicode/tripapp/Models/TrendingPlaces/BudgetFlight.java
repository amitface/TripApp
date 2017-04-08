
package com.hackerearth.ixicode.tripapp.Models.TrendingPlaces;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class BudgetFlight {

    @SerializedName("cityId")
    private String mCityId;
    @SerializedName("cityName")
    private String mCityName;
    @SerializedName("countryName")
    private String mCountryName;
    @SerializedName("currency")
    private String mCurrency;
    @SerializedName("data")
    private String mData;
    @SerializedName("destinationCategories")
    private List<String> mDestinationCategories;
    @SerializedName("image")
    private String mImage;
    @SerializedName("name")
    private String mName;
    @SerializedName("price")
    private Long mPrice;
    @SerializedName("stateName")
    private String mStateName;
    @SerializedName("text")
    private String mText;
    @SerializedName("type")
    private String mType;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("Downloaded")
    private Boolean mDownloaded;

    public String getCityId() {
        return mCityId;
    }

    public void setCityId(String cityId) {
        mCityId = cityId;
    }

    public String getCityName() {
        return mCityName;
    }

    public void setCityName(String cityName) {
        mCityName = cityName;
    }

    public String getCountryName() {
        return mCountryName;
    }

    public void setCountryName(String countryName) {
        mCountryName = countryName;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public String getData() {
        return mData;
    }

    public void setData(String data) {
        mData = data;
    }

    public List<String> getDestinationCategories() {
        return mDestinationCategories;
    }

    public void setDestinationCategories(List<String> destinationCategories) {
        mDestinationCategories = destinationCategories;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getPrice() {
        return mPrice;
    }

    public void setPrice(Long price) {
        mPrice = price;
    }

    public String getStateName() {
        return mStateName;
    }

    public void setStateName(String stateName) {
        mStateName = stateName;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public Boolean getmDownloaded() {
        return mDownloaded;
    }

    public void setmDownloaded(Boolean mDownloaded) {
        this.mDownloaded = mDownloaded;
    }
}
