package com.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/redirect")
public class RedirectPassController2 {

    @ModelAttribute("customer")
    public Customer getEmployee(){
        Customer customer = new Customer();
        customer.setId(142);
        customer.setName("张三");
        customer.setAge(15);
        customer.setAdress("hwfgeugf");
        return customer;
    }

    @GetMapping("/customer")
    public String getName(@ModelAttribute(binding = true) Customer customer, Model model){
        return "index";
    }
}
