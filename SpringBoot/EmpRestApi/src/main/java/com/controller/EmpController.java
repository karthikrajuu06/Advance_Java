package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmpController {

	private final EmployeeService es;

	public EmpController(EmployeeService es) {
		super();
		this.es = es;
	}
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp) {
		return es.addEmployee(emp);
	}
	
	@GetMapping
	public List<Employee> getAllEmp(){
		return es.getAllEmp();
	}
	
	@DeleteMapping("/{eid}")
	public void deleteEmpId(@PathVariable int eid) {
		es.deleteId(eid);
	}
	
	/*
	 * @PutMapping("/{eid}") public Employee updateEmp(@RequestBody Employee
	 * emp,@PathVariable int eid) { return es.updateEmp(emp,eid); }
	 */
	 
	}

