package com.controllor;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;
@HandlesTypes(MyAppInitializer.class)
public class MyServletContainerInit implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("first",MyfirstServlet.class);
        servletRegistration.addMapping("/list");

        for (Class<?> clz : set){
            if (MyAppInitializer.class.isAssignableFrom(clz)){
                try {
                    MyAppInitializer myAppInitializer = (MyAppInitializer) clz.newInstance();
                    myAppInitializer.DoSthing(servletContext);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
