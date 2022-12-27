package com.tcs.boot.utils;

import java.util.Base64;

public class PasswordEncoder {

	public PasswordEncoder() {
		System.out.println("PasswordEncoder :: Constuctor");
	}

	public String encryptData(String pwd) {
		Base64.Encoder encoder = Base64.getEncoder();
		String encodedPwd = encoder.encodeToString(pwd.getBytes());
		return encodedPwd;
	}
}
