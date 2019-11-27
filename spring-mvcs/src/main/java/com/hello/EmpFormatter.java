package com.hello;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class EmpFormatter implements Formatter<Employee> {

    @Override
    public Employee parse(String s, Locale locale) throws ParseException {
        String[] data = s.split("。");
        Employee employee = new Employee();
        employee.setName(data[0]);
        employee.setSex(data[1]);
        return employee;
    }

    @Override
    public String print(Employee employee, Locale locale) {
        return employee.toString();
    }
}
