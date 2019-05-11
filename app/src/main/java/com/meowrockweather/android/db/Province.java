package com.meowrockweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    //LitePal中的每一个实体类都是必须要继承自DataSupport 类的
    private int id; //此id是省份的id

    private String provinceName;//省份名字

    private int provinceCode;//省份在api中的代码

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
