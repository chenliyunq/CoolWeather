package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 陈丽云 on 2017/12/11.
 */

public class Province  extends DataSupport{
   private int id;
    private String provinceName;   //省名
    private int provinceCode;      //省编号
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}

