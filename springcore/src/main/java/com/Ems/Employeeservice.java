package com.Ems;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Employeeservice {

    @Autowired
    private Employee employee;

    public void showEmployee() {
        employee.display();
    }
}

