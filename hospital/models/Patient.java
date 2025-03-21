package com.hospital.models;

public class Patient {
	private String id;
	private String name;
	private int age;
	private String gender;
	private String diagnosis;
	
	public Patient(String id, String name, int age, String gender, String diagnosis) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.diagnosis = diagnosis;
	}
	
	public String getId() {
	        return id;
	}
	public void setId(String id) {
	        this.id = id;
	}
	public String getName() {
	        return name;
	}
	
	public void setName(String name) {
	        this.name = name;
	}
	
	public int getAge() {
	        return age;
	}
	
	public void setAge(int age) {
	        this.age = age;
	}
	
	public String getGender() {
	        return gender;
	}
	
	public void setGender(String gender) {
	        this.gender = gender;
	}
	
	public String getDiagnosis() {
	        return diagnosis;
	}
	
	public void setDiagnosis(String diagnosis) {
	        this.diagnosis = diagnosis;
	}
	
	public String toString() {
	        return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", diagnosis=" + diagnosis + "]";
	}
}
