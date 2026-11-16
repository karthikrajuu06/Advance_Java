
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

    // CREATE
    public void saveEmp(Employee emp) {
        er.save(emp);
    }

    // READ ALL
    public List<Employee> getAllEmp() {
        return er.findAll();
    }

    // READ BY ID
    public Employee getEmpById(int id) {
        return er.findById(id).orElse(null);
    }

    // UPDATE
    public void updateEmp(Employee emp) {
        er.save(emp);
    }

    // DELETE
    public void deleteEmp(int id) {
        er.deleteById(id);
    }
}
