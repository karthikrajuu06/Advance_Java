package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Employee;

public interface EmpRepo  extends JpaRepository <Employee,Integer>{

}
