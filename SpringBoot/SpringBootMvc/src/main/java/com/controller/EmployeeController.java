package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.repository.EmployeeRepo;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	
	EmployeeRepo er;

	@GetMapping("/addEmp")
	public String addEmp() {

		return "addEmployee";
	}

	
	 @PostMapping("/saveEmp") 
	  public ModelAndView saveEmp (@ModelAttribute Employee emp) { 
		  er.save(emp);
		  
	 System.out.println("Employees register successfully");
	  
	 return new ModelAndView("redirect:/employees/addEmp"); 
	 }

/*2PostMapping("/saveEmp")
public ModelAndView saveEmp(@ModelAttribute Employee emp) {

    System.out.println("========== EMPLOYEE DETAILS ==========");
    System.out.println("Employee ID: " + emp.geteid());
    System.out.println("Employee Name: " + emp.getename());
    System.out.println("Employee Salary: " + emp.getSalary());

    er.save(emp);

    System.out.println("Employee registered successfully!");

    return new ModelAndView("redirect:/employees/addEmp");
}*/

	

 

}
