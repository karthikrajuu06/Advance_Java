package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	EmployeeRepository er;
	
	public EmployeeService(EmployeeRepository er) {
		super();
		this.er = er;
	}


	public void AddEmployee(Employee emp) {
		er.save(emp);
		System.out.println("employees Saved");
	}
}
