package com.tcs.boot.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalController {
	@GetMapping("/personal")
	public String getPersonalDetails(Model model) {
		String name = "SanjayKumar";
		Integer age = 25;
		String address = "Hyderabad, Telangana";
		
		/*
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("address", address);
		*/
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("age", String.valueOf(age));
		map.put("address", address);
		
		model.addAllAttributes(map);
		
		return "personal";
	}
}
