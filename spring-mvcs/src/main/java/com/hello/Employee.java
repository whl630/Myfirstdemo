package com.hello;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private String sex;
    private Boolean isState;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getState() {
        return isState;
    }

    public void setState(Boolean state) {
        isState = state;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", isState=" + isState +
                '}';
    }
}
