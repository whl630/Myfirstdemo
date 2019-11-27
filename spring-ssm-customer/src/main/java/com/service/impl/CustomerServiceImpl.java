package com.service.impl;

import com.dao.CustomerDao;
import com.entity.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getAllCustomers(int pageNum, int pageSize) {
        return customerDao.getAllCustomers(pageNum,pageSize);
    }

    @Transactional
    @Override
    public void getTx(int pageNum, int pageSize) {
        customerDao.delete();
        customerDao.getAllCustomers(pageNum,pageSize);
    }
}
