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


	@GetMapping("/getEmp")
     public ModelAndView getAllEmployee() {
		System.out.println("get employee methods");
		List<Employee> emps = es.getAllEmp();
		ModelAndView mv = new ModelAndView();
		mv.addObject("employees",emps);
		mv.setViewName("employeelist");
		return mv;
		
	}
	
	
 

}
