package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo er ;

}
