package com.dao;

import com.entity.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerDao {
    List<Customer> getAllCustomers(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    int delete();
}
