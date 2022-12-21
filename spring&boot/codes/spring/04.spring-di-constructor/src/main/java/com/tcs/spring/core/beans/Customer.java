package com.tcs.spring.core.beans;

public class Customer {
	private String name;
	private Car car;
	
	public Customer() {
		System.out.println("no arg constructor");
	}

	public Customer(Car car) {
		super();
		this.car = car;
		System.out.println("one arg constructor");
	}

	public Customer(String name, Car car) {
		super();
		this.name = name;
		this.car = car;
		System.out.println("two args constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("in setName() method");
	}

	public Car getCar() {
		return car;
	}
}
