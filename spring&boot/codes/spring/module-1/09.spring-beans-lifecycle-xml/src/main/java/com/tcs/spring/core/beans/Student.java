package com.tcs.spring.core.beans;

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
	
	public void myInit1() {
		System.out.println("--- user-defined initialization-1 ---");
	}
	
	public void myInit2() {
		System.out.println("--- user-defined initialization-2 ---");
	}	
	
	public void myDestructor() {
		System.out.println("--- user-defined destructor ---");
	}
}
