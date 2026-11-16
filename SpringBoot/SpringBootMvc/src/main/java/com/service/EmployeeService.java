
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repository.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    
    private EmployeeRepo er;

    public void saveEmp(Employee emp) {
        er.save(emp);
    }

    public List<Employee> getAllEmp() {
        return er.findAll();
    }
}
