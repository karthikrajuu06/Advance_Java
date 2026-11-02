package com.hms;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		 ApplicationContext context = new ClassPathXmlApplicationContext
                                          ("beans.xml");
		 

	        // Retrieve Patient Bean

	        Patient patient =
	                context.getBean("patientSingleton", Patient.class);


	        // Patient Details

	        System.out.println("===== PATIENT DETAILS =====");

	        System.out.println("Patient ID   : " + patient.getPatientid());
	        System.out.println("Patient Name : " + patient.getPatientName());
	        System.out.println("Age          : " + patient.getAge());
	        System.out.println("Phone Number : " + patient.getPhoneNumber());


	        // Doctor Details

	        Doctor doctor = patient.getDoctor();

	        System.out.println("\n===== DOCTOR DETAILS =====");

	        System.out.println("Doctor ID      : " + doctor.getDoctorId());
	        System.out.println("Doctor Name    : " + doctor.getDoctorName());
	        System.out.println("Specialization : " + doctor.getSpecialization());


	        // Medicines

	        System.out.println("\n===== MEDICINES =====");

	        for (String medicine : patient.getMedicines()) {
	            System.out.println(medicine);
	        }


	        // Medical Tests

	        System.out.println("\n===== MEDICAL TESTS =====");

	        for (String test : patient.getMedicalTests()) {
	            System.out.println(test);
	        }


	        // Test Fees

	        System.out.println("\n===== TEST FEES =====");

	        for (Map.Entry<String, Integer> entry :
	                patient.getTestFees().entrySet()) {

	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }


	        // Bean Scope Testing

	        System.out.println("\n===== BEAN SCOPE =====");

	        Patient p1 = context.getBean("patientSingleton", Patient.class);
	        Patient p2 = context.getBean("patientSingleton", Patient.class);

	        System.out.println("Singleton Same Object : " + (p1 == p2));


	        Patient p3 = context.getBean("patientPrototype", Patient.class);
	        Patient p4 = context.getBean("patientPrototype", Patient.class);

	        System.out.println("Prototype Same Object : " + (p3 == p4));



	    }
	
	}


