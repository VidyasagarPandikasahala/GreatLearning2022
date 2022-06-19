package com.greatlearning.email.model;

public class Employee {
	private String firstName;
	private String lastName;
	
	public Employee (String firstName, String lastName) {
		
			this.setfirstName (firstName);
			this.setlastName(lastName);
		}
	
	public String getfirstName() {
		return this.firstName;
	}
	
	public void setfirstName(String name) {
		this.firstName = name;
	}
	
	public String getlastName() {
		return this.lastName;
	}
	
	public void setlastName(String name) {
		this.lastName = name;
	}
}
