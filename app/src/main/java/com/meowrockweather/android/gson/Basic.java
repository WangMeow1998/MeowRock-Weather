package com.meowrockweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.io.StringReader;

public class Basic {

    @SerializedName("city") //城市名称
    public String cityName;

    @SerializedName("id") //api中城市所对应的id
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc") //本地时间
        public String updateTime;
    }

}
