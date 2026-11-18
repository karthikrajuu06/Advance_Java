package com.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.model.Employee;
import java.util.Optional;
import com.repository.EmpRepo;

@Service
public class EmployeeService {
	private final EmpRepo er;
	
	public EmployeeService(EmpRepo er) {
		super();
		this.er = er;
	}
	
	public Employee addEmployee(Employee emp) {	
		return er.save(emp);
	}
	
	public List<Employee> getAllEmp(){
	     return er.findAll();
	}
	
	public void deleteId(int eid) {
		er.deleteById(eid);
		System.out.println("delte successfully");
		
	}
	
	
	public Employee findById(int eid) {
		Employee emp=er.findById(eid).orElseThrow();
		return emp;
	}
	
	/*
	 * public Employee updateEmp(Employee emp,int eid){ Employee emp1=findById(eid);
	 * emp1.setEname(emp.getEname()); er.save(emp1); return emp1; }
	 */
	
}

 
 