package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * @author LiuSaiSai
 * @description:
 * @date :2020/02/21 10:56
 */
public class County extends LitePalSupport {

    private int id;

    private String countyName; //县名

    private String weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
