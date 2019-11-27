package com.controllor;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyAppInitializerImpl implements MyAppInitializer {
    @Override
    public void DoSthing(ServletContext context) {
        ServletRegistration.Dynamic servletRegistration = context.addServlet("second",MySecondServlet.class);
        servletRegistration.addMapping("/second");
    }
}
