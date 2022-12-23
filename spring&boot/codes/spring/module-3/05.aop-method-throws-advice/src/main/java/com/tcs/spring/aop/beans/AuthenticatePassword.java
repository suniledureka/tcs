package com.tcs.spring.aop.beans;

public class AuthenticatePassword {
	public boolean validatePassword(String password) throws Exception{
		if(password.length() < 8)
			throw new Exception("Password Length Validation Failed!");
		return true;
	}
}