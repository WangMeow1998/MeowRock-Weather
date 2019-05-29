package com.meowrockweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")//温度
    public String temperature;

    @SerializedName("cond")//天气状况
    public More more;

    public class More{
        @SerializedName("txt")
        public String info; //天气状况文本
    }
}
