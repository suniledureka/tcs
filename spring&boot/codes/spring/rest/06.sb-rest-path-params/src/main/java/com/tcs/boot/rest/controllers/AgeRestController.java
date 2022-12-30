package com.tcs.boot.rest.controllers;

import java.util.Calendar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal")
public class AgeRestController {
	@GetMapping("/age/{name}/{yob}")
	public ResponseEntity<String> calculateAge(@PathVariable("name") String name, @PathVariable Integer yob){
		
		String text = "";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		
		if(isYearOfBirthValid(yob)) {
			int age = getAge(yob);
			text = "Hi "+ name + ", You are "+ age + " Years of Age";
			status = HttpStatus.OK;
		}else {
			text = "Hi " +name+", Please provide us the currect YOB";
		}
		
		ResponseEntity<String> entity = new ResponseEntity<>(text, status);
		
		return entity;
	}
	
	private static Integer getCurrentYear() {
		Calendar cal = Calendar.getInstance();
		int currentYear = cal.get(Calendar.YEAR);
		return currentYear;
	}
	
	private boolean isYearOfBirthValid(int yob) {
		return getCurrentYear() > yob ? true : false; 
	}
	
	private int getAge(int yob) {
		return getCurrentYear() - yob;
	}
}
