
package com.hackerearth.ixicode.tripapp.Models.BetweenTwoPlaces;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FastestRoute {

    @SerializedName("allStepModes")
    private String mAllStepModes;
    @SerializedName("durationHours")
    private String mDurationHours;
    @SerializedName("durationMinutes")
    private String mDurationMinutes;
    @SerializedName("durationPretty")
    private String mDurationPretty;
    @SerializedName("fastestDuration")
    private Long mFastestDuration;
    @SerializedName("firstModeTypesCss")
    private String mFirstModeTypesCss;
    @SerializedName("firstStep")
    private FirstStep mFirstStep;
    @SerializedName("layOverTimes")
    private List<Long> mLayOverTimes;
    @SerializedName("modeTypesCss")
    private List<String> mModeTypesCss;
    @SerializedName("modeViaString")
    private String mModeViaString;
    @SerializedName("modes")
    private List<String> mModes;
    @SerializedName("price")
    private Long mPrice;
    @SerializedName("restModeTypesCss")
    private List<String> mRestModeTypesCss;
    @SerializedName("steps")
    private List<Step> mSteps;
    @SerializedName("time")
    private Long mTime;
    @SerializedName("timePretty")
    private String mTimePretty;
    @SerializedName("timePrettySuffix")
    private String mTimePrettySuffix;
    @SerializedName("timeUnit")
    private String mTimeUnit;
    @SerializedName("type")
    private String mType;
    @SerializedName("via")
    private List<String> mVia;

    public String getAllStepModes() {
        return mAllStepModes;
    }

    public void setAllStepModes(String allStepModes) {
        mAllStepModes = allStepModes;
    }

    public String getDurationHours() {
        return mDurationHours;
    }

    public void setDurationHours(String durationHours) {
        mDurationHours = durationHours;
    }

    public String getDurationMinutes() {
        return mDurationMinutes;
    }

    public void setDurationMinutes(String durationMinutes) {
        mDurationMinutes = durationMinutes;
    }

    public String getDurationPretty() {
        return mDurationPretty;
    }

    public void setDurationPretty(String durationPretty) {
        mDurationPretty = durationPretty;
    }

    public Long getFastestDuration() {
        return mFastestDuration;
    }

    public void setFastestDuration(Long fastestDuration) {
        mFastestDuration = fastestDuration;
    }

    public String getFirstModeTypesCss() {
        return mFirstModeTypesCss;
    }

    public void setFirstModeTypesCss(String firstModeTypesCss) {
        mFirstModeTypesCss = firstModeTypesCss;
    }

    public FirstStep getFirstStep() {
        return mFirstStep;
    }

    public void setFirstStep(FirstStep firstStep) {
        mFirstStep = firstStep;
    }

    public List<Long> getLayOverTimes() {
        return mLayOverTimes;
    }

    public void setLayOverTimes(List<Long> layOverTimes) {
        mLayOverTimes = layOverTimes;
    }

    public List<String> getModeTypesCss() {
        return mModeTypesCss;
    }

    public void setModeTypesCss(List<String> modeTypesCss) {
        mModeTypesCss = modeTypesCss;
    }

    public String getModeViaString() {
        return mModeViaString;
    }

    public void setModeViaString(String modeViaString) {
        mModeViaString = modeViaString;
    }

    public List<String> getModes() {
        return mModes;
    }

    public void setModes(List<String> modes) {
        mModes = modes;
    }

    public Long getPrice() {
        return mPrice;
    }

    public void setPrice(Long price) {
        mPrice = price;
    }

    public List<String> getRestModeTypesCss() {
        return mRestModeTypesCss;
    }

    public void setRestModeTypesCss(List<String> restModeTypesCss) {
        mRestModeTypesCss = restModeTypesCss;
    }

    public List<Step> getSteps() {
        return mSteps;
    }

    public void setSteps(List<Step> steps) {
        mSteps = steps;
    }

    public Long getTime() {
        return mTime;
    }

    public void setTime(Long time) {
        mTime = time;
    }

    public String getTimePretty() {
        return mTimePretty;
    }

    public void setTimePretty(String timePretty) {
        mTimePretty = timePretty;
    }

    public String getTimePrettySuffix() {
        return mTimePrettySuffix;
    }

    public void setTimePrettySuffix(String timePrettySuffix) {
        mTimePrettySuffix = timePrettySuffix;
    }

    public String getTimeUnit() {
        return mTimeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        mTimeUnit = timeUnit;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public List<String> getVia() {
        return mVia;
    }

    public void setVia(List<String> via) {
        mVia = via;
    }

}
