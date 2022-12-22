package com.tcs.spring.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private String name;
	
	public Student() {
		System.out.println("--- Zero Argument Constructor ---");
	}

	public Student(String name) {
		this.name = name;
		System.out.println("--- One Argument Constructor ---");
	}

	public String getName() {
		System.out.println("--- in getName() method ---");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("--- in setName() method ---");
	}

	@Override
	public String toString() {
		return "Student [name= " + name + "]";
	}	
	
	@PostConstruct
	public void myInit() {
		System.out.println("--- the initialization method which will be executed after the bean initialization ---");
	}
	
	@PreDestroy
	public void myDestructor() {
		System.out.println("--- user-defined destructor ---");
	}
}
