package com.meowrockweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf") //舒适度
    public Comfort comfort;

    @SerializedName("cw") //洗车
    public CarWash carWash;

    public Sport sport; //运动

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
