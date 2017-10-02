package com.example.doanlv4.databindingdemo.second;

/**
 * Created by doanLV4 on 10/2/2017.
 */

public class SinhVien {
    private String name;
    private String age;

    public SinhVien() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public SinhVien(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
