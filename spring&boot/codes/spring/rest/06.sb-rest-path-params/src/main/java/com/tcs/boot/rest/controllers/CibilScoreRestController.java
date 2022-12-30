package com.tcs.boot.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cibil")
public class CibilScoreRestController {
	@GetMapping("/score/{pan}")
	public ResponseEntity<?> getCibilScore(@PathVariable("pan") String pan){
	//public ResponseEntity<?> getCibilScore(@PathVariable String pan){
	//public ResponseEntity<?> getCibilScore(@PathVariable(value = "pan") String pan){
		ResponseEntity<String> entity = null;
		String text = "";
		
		if(pan != null && pan.length()==10) {
			//logic to get cibil score for the pan from DB
			text = pan + "'s CIBIL Score is 795";
			entity =  new ResponseEntity<>(text,HttpStatus.OK);
		}else {
			text = "Please provide a valid PAN number";
			entity =  new ResponseEntity<>(text,HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}
}
