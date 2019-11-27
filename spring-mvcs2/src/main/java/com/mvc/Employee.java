package com.mvc;

import org.hibernate.validator.constraints.Range;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.*;
import java.util.Date;

public class Employee {
    @NotNull
    private Integer id;
    @Size(min = 4,max = 8,message = "字段长度有误！")
    @NotNull
    private String name;
    @Email(message = "Email格式有误！")
    private String email;
    @NotNull
    private String sex;
    @Range(min = 18,max = 30)
    private int age;
    @Past
    //必须是过去的日期
    private Date date;
    @DecimalMax("15000")
    private double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", money=" + money +
                '}';
    }
}
