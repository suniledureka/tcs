package com.tcs.spring.aop.beans;

import java.util.Random;

public class Account {
	public boolean deposit() {
		System.out.println("--- a generic deposit() method ---");
		boolean depStatus = new Random().nextBoolean();
		return depStatus;
	}
	
	public void deposit(String acno, float amt) {
		System.out.println("--- core concern for depositing amount ---");
		System.out.println("Rs."+amt+" Credited to A/C: "+ acno);
	}	
}