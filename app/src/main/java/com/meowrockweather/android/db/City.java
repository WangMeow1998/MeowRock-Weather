package com.meowrockweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id;//此id是city的id

    private String cityName;

    private int cityCode;

    private int provinceId;//城市所隶属的省份的ID

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getProvinceId(){
        return provinceId;
    }

    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
