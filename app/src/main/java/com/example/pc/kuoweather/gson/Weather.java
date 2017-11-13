package com.example.pc.kuoweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pc on 2017/11/13.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
