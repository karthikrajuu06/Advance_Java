package com.Ems;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

       
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        
        Employeeservice service =
                context.getBean(Employeeservice.class);

        service.showEmployee();

        
       
    }
}

