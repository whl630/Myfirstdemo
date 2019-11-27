package com.controller;

import com.entity.Customer;
import com.github.pagehelper.PageInfo;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ListCustomerServlet {
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/list")
    public String list(@RequestParam(required = false,defaultValue = "1",value = "pageNum") int pageNum,
                       @RequestParam(required = false,defaultValue = "3",value = "pageSize")int pageSize, Model model){
        List<Customer> lists = customerService.getAllCustomers(pageNum,pageSize);
        PageInfo<Customer> pageInfo = new PageInfo<>(lists,3);
        model.addAttribute("customer",pageInfo);
        return "ListCustomers";
    }
}
