
package com.hackerearth.ixicode.tripapp.Models.TrendingPlaces;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Data {

    @SerializedName("budget_flight")
    private List<BudgetFlight> mBudgetFlight;
    @SerializedName("flight")
    private List<Flight> mFlight;

    public List<BudgetFlight> getBudgetFlight() {
        return mBudgetFlight;
    }

    public void setBudgetFlight(List<BudgetFlight> budgetFlight) {
        mBudgetFlight = budgetFlight;
    }

    public List<Flight> getFlight() {
        return mFlight;
    }

    public void setFlight(List<Flight> flight) {
        mFlight = flight;
    }

}
