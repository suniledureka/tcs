package com.tcs.boot.rest.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateRestController {
	@GetMapping(value = {"/date","/today"})
	public ResponseEntity<String> sendTodayDate(){
		Date d = new Date();
		SimpleDateFormat formatter =new SimpleDateFormat("dd-MM-yyyy::HH:mm:ss");
		
		String dateText = formatter.format(d);
		
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(dateText, HttpStatus.OK);
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(dateText, HttpStatus.CREATED);
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(dateText, HttpStatus.BAD_REQUEST);
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(dateText, HttpStatus.UNAUTHORIZED);
		
		/*--- to include response headers with ResponseEntity ---*/
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("company", "Tata Consultancy Services");
		responseHeaders.add("location", "Hyderabad");
		
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(dateText, responseHeaders, HttpStatus.OK);
		
		return responseEntity;
	}
}