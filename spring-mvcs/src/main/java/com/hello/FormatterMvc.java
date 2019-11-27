package com.hello;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;


@Controller
@RequestMapping("/mvc")
public class FormatterMvc {
    @GetMapping("/data")
    public String getName(Date data){
        System.out.println("日期：" + data);
        return "hello";
    }
    @GetMapping("/emp")
    public String getEmployee(@RequestParam("e")Employee employee){
        System.out.println(employee);
        return  "hello";
    }

    @GetMapping("/string")
    public String getName(String[] var){
        for (String s : var) {
            System.out.println(s);
        }
        return "hello";
    }

}
