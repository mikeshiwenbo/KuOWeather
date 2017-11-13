package com.example.pc.kuoweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pc on 2017/11/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
