package com.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeControllor {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/index2")
    public String index2(){
        return "list";
    }

    @GetMapping("/login")
    public String login(){
        return "Login";
    }
    @PostMapping("/login")
    public String login(String myfile, HttpSession session){
        if ("admin".equalsIgnoreCase(myfile)){
            session.setAttribute("login",myfile);
            return "index";
        }else {
            return "redirect:login";
        }
    }
}
