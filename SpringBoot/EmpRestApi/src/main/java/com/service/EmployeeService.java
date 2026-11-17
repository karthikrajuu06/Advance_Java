package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.model.Employee;
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
	public List<Employee>getAllEmp(){
		return er.findAll();
	}

 public void deleteId(int eid) {
	 er.deleteById(eid);
	 System.out.println("Deleted Cuccessfully");
 }
 
 public Employee findById(int eid) {
	 Optional<Employee> emp = er.findById(eid);
	 Employee emp = er.findById(eid)
	 return emp;
 }
 
 public Employee   updateEmp() {
	return null;
	 
 }
 }
 