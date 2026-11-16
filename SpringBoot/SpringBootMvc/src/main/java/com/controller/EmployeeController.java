
package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService es;

    @GetMapping("/addEmp")
    public String addEmp() {
        return "addEmployee";
    }

    @PostMapping("/saveEmp")
    public ModelAndView saveEmp(@ModelAttribute Employee emp) {

        System.out.println("Employee Name: " + emp.getEname());
        System.out.println("Employee Salary: " + emp.getSalary());

        es.saveEmp(emp);

        System.out.println("Employee registered successfully");

        return new ModelAndView("redirect:/employees/getEmp");
    }

    @GetMapping("/getEmp")
    public ModelAndView getAllEmployee() {

        System.out.println("Getting employee records");

        List<Employee> emps = es.getAllEmp();

        ModelAndView mv = new ModelAndView("employeelist");

        mv.addObject("employees", emps);

        return mv;
    }
}
