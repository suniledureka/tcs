package com.tcs.spring.core.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
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

	public void afterPropertiesSet() throws Exception {
		System.out.println("--- user-defined initialization ---");		
	}

	public void destroy() throws Exception {
		System.out.println("--- user-defined destructor ---");		
	}
}
