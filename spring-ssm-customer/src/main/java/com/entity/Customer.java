package com.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Customer {
    private int id;
    private String name;
    private int age;
    private Date times;
    private int deptid;

    private Customer(Builder builder) {
        id = builder.id;
        name = builder.name;
        age = builder.age;
        times = builder.times;
        deptid = builder.deptid;
    }

    public static final class Builder {
        private int id;
        private String name;
        private int age;
        private Date times;
        private int deptid;

        public Builder() {
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder times(Date val) {
            times = val;
            return this;
        }

        public Builder deptid(int val) {
            deptid = val;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
