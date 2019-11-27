package com.haha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class emp {
    @RequestMapping("/aaa")
    public String getName(){
        return "index";
    }

//    @RequestMapping("/1.css")
//    public String getName1(){
//        return "index";
//    }
}
