package com.tcs.boot.web.controllers;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personal")
public class AgeController {
	@GetMapping("/age/{name}/{yob}")	
	public String getAge(@PathVariable("name") String name, @PathVariable Integer yob, Model model) {
		String msg="";
		
		if(isValid(yob)) {
			int age = calculateAge(yob);
			msg = "Hi "+name+", you are with "+ age +" years of Age and are elgible for this Insurance" ;
		}else {
			msg = "Hi "+name+", please submit the correct YOB";
		}
		
		model.addAttribute("message", msg);
		
		return "age";
	}
	
	private int getCurrentYear() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.YEAR);
	}
	
	private boolean isValid(Integer yob) {
		return (yob < getCurrentYear()) ? true : false;
	}

	private int calculateAge(Integer yob) {
		int age = getCurrentYear() - yob;
		return age;
	}
}
