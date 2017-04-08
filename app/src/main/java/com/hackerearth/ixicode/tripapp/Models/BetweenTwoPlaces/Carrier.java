
package com.hackerearth.ixicode.tripapp.Models.BetweenTwoPlaces;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Carrier {

    @SerializedName("arrTime")
    private Object mArrTime;
    @SerializedName("availableClassList")
    private List<Object> mAvailableClassList;
    @SerializedName("busAmenitiesList")
    private List<String> mBusAmenitiesList;
    @SerializedName("carrierName")
    private String mCarrierName;
    @SerializedName("code")
    private String mCode;
    @SerializedName("commaSeparatedDOO")
    private String mCommaSeparatedDOO;
    @SerializedName("daysOfOperation")
    private String mDaysOfOperation;
    @SerializedName("depTime")
    private Object mDepTime;
    @SerializedName("destinationCode")
    private String mDestinationCode;
    @SerializedName("originCode")
    private String mOriginCode;
    @SerializedName("price")
    private Object mPrice;
    @SerializedName("tfList")
    private TfList mTfList;
    @SerializedName("time")
    private Long mTime;
    @SerializedName("trainType")
    private Object mTrainType;

    public Object getArrTime() {
        return mArrTime;
    }

    public void setArrTime(Object arrTime) {
        mArrTime = arrTime;
    }

    public List<Object> getAvailableClassList() {
        return mAvailableClassList;
    }

    public void setAvailableClassList(List<Object> availableClassList) {
        mAvailableClassList = availableClassList;
    }

    public List<String> getBusAmenitiesList() {
        return mBusAmenitiesList;
    }

    public void setBusAmenitiesList(List<String> busAmenitiesList) {
        mBusAmenitiesList = busAmenitiesList;
    }

    public String getCarrierName() {
        return mCarrierName;
    }

    public void setCarrierName(String carrierName) {
        mCarrierName = carrierName;
    }

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public String getCommaSeparatedDOO() {
        return mCommaSeparatedDOO;
    }

    public void setCommaSeparatedDOO(String commaSeparatedDOO) {
        mCommaSeparatedDOO = commaSeparatedDOO;
    }

    public String getDaysOfOperation() {
        return mDaysOfOperation;
    }

    public void setDaysOfOperation(String daysOfOperation) {
        mDaysOfOperation = daysOfOperation;
    }

    public Object getDepTime() {
        return mDepTime;
    }

    public void setDepTime(Object depTime) {
        mDepTime = depTime;
    }

    public String getDestinationCode() {
        return mDestinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        mDestinationCode = destinationCode;
    }

    public String getOriginCode() {
        return mOriginCode;
    }

    public void setOriginCode(String originCode) {
        mOriginCode = originCode;
    }

    public Object getPrice() {
        return mPrice;
    }

    public void setPrice(Object price) {
        mPrice = price;
    }

    public TfList getTfList() {
        return mTfList;
    }

    public void setTfList(TfList tfList) {
        mTfList = tfList;
    }

    public Long getTime() {
        return mTime;
    }

    public void setTime(Long time) {
        mTime = time;
    }

    public Object getTrainType() {
        return mTrainType;
    }

    public void setTrainType(Object trainType) {
        mTrainType = trainType;
    }

}
