package com.tcs.boot.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	//@RequestMapping("/welcome")
	//@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	@GetMapping("/welcome")
	public String sendWelcomeMessage() {
		String response = "Welcome to Tata Consultancy Services";
		return response;
	}
}