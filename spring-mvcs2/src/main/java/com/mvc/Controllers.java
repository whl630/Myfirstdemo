package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class Controllers {
    @RequestMapping("/index")
        public ModelAndView getName( @Valid Employee emp, BindingResult rs){
        ModelAndView modelAndView = new ModelAndView();
        if (rs.hasErrors()){
            List<FieldError> list = rs.getFieldErrors();
            for (FieldError fieldError : list) {
                modelAndView.addObject(fieldError.getField(),fieldError.getDefaultMessage());
            }
            System.out.println(modelAndView);
            modelAndView.setViewName("errors");
        }else {
            System.out.println(emp);
            modelAndView.setViewName("index");
        }
        return modelAndView;
    }
}
