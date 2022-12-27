package com.tcs.app;

import java.lang.reflect.Field;

public class TestApp {

	public static void main(String[] args) throws Exception {
		User userObj = new User();
		//userObj.age = 35; //The field User.age is not visible
		System.out.println(userObj);
		
		Class<?> clz = Class.forName("com.tcs.app.User");
		Field ageField = clz.getDeclaredField("age");
		ageField.setAccessible(true);		
		
		ageField.set(userObj, 35);
		System.out.println(userObj);
	}
}