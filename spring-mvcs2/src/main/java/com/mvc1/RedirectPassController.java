package com.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/redirect")
public class RedirectPassController {
    @GetMapping("/list")
    public String getName(HttpSession session){
        session.setAttribute("a","掐死你个叼毛");
        return "redirect:list1";
    }
    @GetMapping("/list1")
    public String getName1(){
        return "index";
    }


    @GetMapping("/list2")
    public String getName2(){
        return "redirect:list3?a=什么是叼毛，陈亮就是！";
    }
    @GetMapping("/list3")
    public String getName3(String a, Model model){
        model.addAttribute("a",a);
        return "index";
    }



    @GetMapping("/list33")
    public String getName33(RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("b","人生自古谁无死，");
        redirectAttributes.addFlashAttribute("a","留取丹心照汗青！");
        return "redirect:list4";
    }
    @GetMapping("/list4")
    public String getName4(String b, Model model){
        return "index";
    }
    @GetMapping("/list5")
    public String getName5(){
        return "index";
    }

}
