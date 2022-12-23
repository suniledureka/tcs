package com.tcs.spring.aop.beans;

public class Account {
	public void deposit() {
		System.out.println("$$$-- a generic deposit method --$$$");
	}

	public void deposit(String acno, float amount) {
		System.out.println("$$$-- Depositing $" + amount + " in A/C: " + acno + " --$$$");
	}
}
