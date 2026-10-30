package com.hms;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Patient {
	
	private int patientid;
	private String patientName;
	private int age;
	private String phoneNumber;
    private Doctor doctor;
    private List<String> medicines;
    private Set<String> medicalTests;
    private Map<String,Integer> testFees;
	public Patient(int patientid, String patientName, int age, String phoneNumber) {
		super();
		this.patientid = patientid;
		this.patientName = patientName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public List<String> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}
	public Set<String> getMedicalTests() {
		return medicalTests;
	}
	public void setMedicalTests(Set<String> medicalTests) {
		this.medicalTests = medicalTests;
	}
	public Map<String, Integer> getTestFees() {
		return testFees;
	}
	public void setTestFees(Map<String, Integer> testFees) {
		this.testFees = testFees;
	}
 



	


}
