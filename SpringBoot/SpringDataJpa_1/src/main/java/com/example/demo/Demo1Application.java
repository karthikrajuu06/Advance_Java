package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
	
	private EmployeeService es;

	public Demo1Application(EmployeeService es) {
		super();
		this.es = es;
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	
	}
	@Override
	public void run(String... args) throws Exception {
		
		  Employee emp = new Employee("vinay",24);
		  
		  es.AddEmployee(emp);
		 
		
		// Read Operation
		
	/*	3 <Employee>emp = es.retriveEmp();
		if(!emp.isEmpty()) {
			*/
		
	

}
	}
	
