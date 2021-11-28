package com.greatlearning.main;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee (String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
