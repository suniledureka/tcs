package com.tcs.boot.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.boot.rest.bindings.Book;

@RestController
@RequestMapping("/library")
public class LibraryRestController {
	@PostMapping(value = "/save",
			    consumes = {"application/json", "application/xml"})
	public ResponseEntity<String> getBookDetails(@RequestBody Book book){
		//logic to save/insert book details in DB		
		System.out.println(book);
		
		return new ResponseEntity<String>("Book Details are added to Library", HttpStatus.CREATED);
	}    
}
