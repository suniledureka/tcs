package com.tcs.spring.core.beans;

public class User {
	private String firstName;
	private String lastName;

	public User() {
		System.out.println("inside zero argument constructor");
	}

	public User(String firstName, String lastName) {
		System.out.println("inside two argument constructor");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		System.out.println("inside getFirstName() method");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("inside setFirstName() method");
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("inside getLastName() method");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("inside setLastName() method");
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [First Name= " + firstName + " | Last Name= " + lastName + "]";
	}

}
