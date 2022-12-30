package com.tcs.boot.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestRestController {
	@RequestMapping("/data")
	public ResponseEntity<?> showRequestDataAndHeaders(@RequestHeader("Host") String host, 
														@RequestHeader(value="company", required=false, defaultValue = "NA") String comp, 
														@RequestBody(required = false) String data){		
		String text = "Host: "+host +"\n";
		text += "Company: " + comp +"\n";
		text += "Request Data: "+ data;
		
		ResponseEntity<String> respEntity = new ResponseEntity<>(text, HttpStatus.OK);
		return respEntity;
	}
}