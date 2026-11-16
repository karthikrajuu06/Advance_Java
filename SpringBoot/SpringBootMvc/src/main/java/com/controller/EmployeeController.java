
package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService es;

    // CREATE - Show registration form
    @GetMapping("/addEmp")
    public String addEmp() {
        return "addEmployee";
    }

    // CREATE - Save employee
    @PostMapping("/saveEmp")
    public String saveEmp(@ModelAttribute Employee emp) {

        es.saveEmp(emp);

        System.out.println("Employee saved successfully");

        return "redirect:/employees/getEmp";
    }

    // READ - Display all employees
    @GetMapping("/getEmp")
    public ModelAndView getAllEmployee() {

        List<Employee> emps = es.getAllEmp();

        ModelAndView mv = new ModelAndView("employeelist");

        mv.addObject("employees", emps);

        return mv;
    }

    // UPDATE - Display edit form
    @GetMapping("/editEmp/{id}")
    public ModelAndView editEmp(@PathVariable int id) {

        Employee emp = es.getEmpById(id);

        if (emp == null) {
            return new ModelAndView("redirect:/employees/getEmp");
        }

        ModelAndView mv = new ModelAndView("editEmployee");

        mv.addObject("employee", emp);

        return mv;
    }

    // UPDATE - Save modified employee
    @PostMapping("/updateEmp")
    public String updateEmp(@ModelAttribute Employee emp) {

        es.updateEmp(emp);

        System.out.println("Employee updated successfully");

        return "redirect:/employees/getEmp";
    }

    // DELETE - Remove employee
    @GetMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable int id) {

        es.deleteEmp(id);

        System.out.println("Employee deleted successfully");

        return "redirect:/employees/getEmp";
    }
}
