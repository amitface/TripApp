
package com.hackerearth.ixicode.tripapp.Models.BetweenTwoPlaces;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Data {

    @SerializedName("cheapestRoute")
    private CheapestRoute mCheapestRoute;
    @SerializedName("chepOrgDst")
    private String mChepOrgDst;
    @SerializedName("destination")
    private Destination mDestination;
    @SerializedName("destinationName")
    private String mDestinationName;
    @SerializedName("direct")
    private Boolean mDirect;
    @SerializedName("directBus")
    private Boolean mDirectBus;
    @SerializedName("directCar")
    private Boolean mDirectCar;
    @SerializedName("directFlight")
    private Boolean mDirectFlight;
    @SerializedName("directIndirectSentence")
    private String mDirectIndirectSentence;
    @SerializedName("directTrain")
    private Boolean mDirectTrain;
    @SerializedName("distance")
    private Long mDistance;
    @SerializedName("fastOrgDst")
    private String mFastOrgDst;
    @SerializedName("fastestRoute")
    private FastestRoute mFastestRoute;
    @SerializedName("modes")
    private String mModes;
    @SerializedName("multiModes")
    private Boolean mMultiModes;
    @SerializedName("noModesPossible")
    private Boolean mNoModesPossible;
    @SerializedName("origin")
    private Origin mOrigin;
    @SerializedName("originAirportCode")
    private String mOriginAirportCode;
    @SerializedName("originName")
    private String mOriginName;
    @SerializedName("resCount")
    private Long mResCount;
    @SerializedName("routes")
    private List<Route> mRoutes;
    @SerializedName("showSummary")
    private Boolean mShowSummary;
    @SerializedName("sort")
    private String mSort;

    public CheapestRoute getCheapestRoute() {
        return mCheapestRoute;
    }

    public void setCheapestRoute(CheapestRoute cheapestRoute) {
        mCheapestRoute = cheapestRoute;
    }

    public String getChepOrgDst() {
        return mChepOrgDst;
    }

    public void setChepOrgDst(String chepOrgDst) {
        mChepOrgDst = chepOrgDst;
    }

    public Destination getDestination() {
        return mDestination;
    }

    public void setDestination(Destination destination) {
        mDestination = destination;
    }

    public String getDestinationName() {
        return mDestinationName;
    }

    public void setDestinationName(String destinationName) {
        mDestinationName = destinationName;
    }

    public Boolean getDirect() {
        return mDirect;
    }

    public void setDirect(Boolean direct) {
        mDirect = direct;
    }

    public Boolean getDirectBus() {
        return mDirectBus;
    }

    public void setDirectBus(Boolean directBus) {
        mDirectBus = directBus;
    }

    public Boolean getDirectCar() {
        return mDirectCar;
    }

    public void setDirectCar(Boolean directCar) {
        mDirectCar = directCar;
    }

    public Boolean getDirectFlight() {
        return mDirectFlight;
    }

    public void setDirectFlight(Boolean directFlight) {
        mDirectFlight = directFlight;
    }

    public String getDirectIndirectSentence() {
        return mDirectIndirectSentence;
    }

    public void setDirectIndirectSentence(String directIndirectSentence) {
        mDirectIndirectSentence = directIndirectSentence;
    }

    public Boolean getDirectTrain() {
        return mDirectTrain;
    }

    public void setDirectTrain(Boolean directTrain) {
        mDirectTrain = directTrain;
    }

    public Long getDistance() {
        return mDistance;
    }

    public void setDistance(Long distance) {
        mDistance = distance;
    }

    public String getFastOrgDst() {
        return mFastOrgDst;
    }

    public void setFastOrgDst(String fastOrgDst) {
        mFastOrgDst = fastOrgDst;
    }

    public FastestRoute getFastestRoute() {
        return mFastestRoute;
    }

    public void setFastestRoute(FastestRoute fastestRoute) {
        mFastestRoute = fastestRoute;
    }

    public String getModes() {
        return mModes;
    }

    public void setModes(String modes) {
        mModes = modes;
    }

    public Boolean getMultiModes() {
        return mMultiModes;
    }

    public void setMultiModes(Boolean multiModes) {
        mMultiModes = multiModes;
    }

    public Boolean getNoModesPossible() {
        return mNoModesPossible;
    }

    public void setNoModesPossible(Boolean noModesPossible) {
        mNoModesPossible = noModesPossible;
    }

    public Origin getOrigin() {
        return mOrigin;
    }

    public void setOrigin(Origin origin) {
        mOrigin = origin;
    }

    public String getOriginAirportCode() {
        return mOriginAirportCode;
    }

    public void setOriginAirportCode(String originAirportCode) {
        mOriginAirportCode = originAirportCode;
    }

    public String getOriginName() {
        return mOriginName;
    }

    public void setOriginName(String originName) {
        mOriginName = originName;
    }

    public Long getResCount() {
        return mResCount;
    }

    public void setResCount(Long resCount) {
        mResCount = resCount;
    }

    public List<Route> getRoutes() {
        return mRoutes;
    }

    public void setRoutes(List<Route> routes) {
        mRoutes = routes;
    }

    public Boolean getShowSummary() {
        return mShowSummary;
    }

    public void setShowSummary(Boolean showSummary) {
        mShowSummary = showSummary;
    }

    public String getSort() {
        return mSort;
    }

    public void setSort(String sort) {
        mSort = sort;
    }

}
