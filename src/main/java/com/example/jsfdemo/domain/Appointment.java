package com.example.jsfdemo.domain;

import javax.validation.constraints.Pattern;

public class Appointment {

	private String instructor;
	private String student;
	private String date;
	private String time;

	public Appointment(){
		
	}
	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
