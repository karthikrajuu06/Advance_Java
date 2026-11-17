package com.EmpRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com")
@EnableJpaRepositories(basePackages = "com.repository")
@EntityScan(basePackages = "com.model")
public class EmpRestApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EmpRestApiApplication.class, args);
		System.out.println("My Rest ApI Appplication runnig successfully");
		
	}

}
