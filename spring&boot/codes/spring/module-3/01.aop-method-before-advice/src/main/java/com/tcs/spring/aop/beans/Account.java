package com.tcs.spring.aop.beans;

public class Account {
	public void deposit() {
		System.out.println("--- a generic deposit() method ---");
	}
	public void deposit(String acno, float amt) {
		System.out.println("--- core concern for depositing amount ---");
		System.out.println("Rs."+amt+" Credited to A/C: "+ acno);
	}	
}