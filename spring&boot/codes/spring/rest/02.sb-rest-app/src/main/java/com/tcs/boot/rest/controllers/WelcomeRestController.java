package com.tcs.boot.rest.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tcs")
public class WelcomeRestController {
	@GetMapping("/welcome")
	public String sendWelcomeMessageGet() {
		String response = "Welcome to TCS from GET";
		return response;
	}
	
	@PostMapping("/welcome")
	public String sendWelcomeMessagePost() {
		String response = "Welcome to TCS from POST";
		return response;
	}	
	
	@PutMapping("/welcome")
	public String sendWelcomeMessagePut() {
		String response = "Welcome to TCS from PUT";
		return response;
	}	
	
	@DeleteMapping("/welcome")
	public String sendWelcomeMessageDelete() {
		String response = "Welcome to TCS from DELETE";
		return response;
	}	
	
	@PatchMapping("/welcome")
	public String sendWelcomeMessagePatch() {
		String response = "Welcome to TCS from PATCH";
		return response;
	}	
}
