package com.controllor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       String name = (String) request.getSession().getAttribute("login");
       if (name == null){
           response.sendRedirect("/login");
           return false;
       }
        return true;
    }
}
