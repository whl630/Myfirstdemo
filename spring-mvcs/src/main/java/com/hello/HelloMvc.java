package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mvc")
public class HelloMvc {
    @RequestMapping("*")
    public String getName1(){
        return "hello";
    }

    @RequestMapping("/**/*x")
    public String getName2(){
        return "hello";
    }

//    @GetMapping("/hello/page/{pageNo}")
//    public String getName(@PathVariable("pageNo") int pageNo){
//        System.out.println("页码："+pageNo);
//        return "hello";
//    }
//
//    @GetMapping("/index")
//    public String getNume2(@RequestParam(required = true,defaultValue = "5", name = "No") int pageNo){
//        System.out.println("编号："+pageNo);
//        return "hello";
//    }
}
