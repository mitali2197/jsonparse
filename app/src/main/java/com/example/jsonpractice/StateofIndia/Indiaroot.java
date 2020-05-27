package com.example.jsonpractice.StateofIndia;

import com.google.gson.annotations.SerializedName;


public class Indiaroot {
    @SerializedName("City")
    private final String city;

    @SerializedName("State")
    private final String state;

    @SerializedName("District")
    private final String district;

    public Indiaroot(String city, String state, String district) {
        this.city = city;
        this.state = state;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }
}
