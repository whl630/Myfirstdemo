package com.service;

import com.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers(int pageNum,int pageSize);
    void getTx(int pageNum,int pageSize);
}
