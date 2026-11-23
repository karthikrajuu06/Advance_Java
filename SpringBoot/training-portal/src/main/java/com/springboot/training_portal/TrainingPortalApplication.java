package com.springboot.training_portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "com.springboot.training_portal",
    "Controller"
})
public class TrainingPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingPortalApplication.class, args);
        System.out.println("Running successfully");
    }
}

