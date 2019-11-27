package com.emp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class JacksonEmp {

    @RequestMapping("/index")
    public String index(){
        return "ListEmployee";
    }
    @RequestMapping("/list")
    @ResponseBody
    public Employee list(){
        Employee employee = new Employee(1,"张三",new Date());
        return employee;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public Employee insert(@RequestBody Employee employee){
        System.out.println("employee = "+employee);
        Employee emp = new Employee(5,"赵六",new Date());
        return emp;
    }
}
