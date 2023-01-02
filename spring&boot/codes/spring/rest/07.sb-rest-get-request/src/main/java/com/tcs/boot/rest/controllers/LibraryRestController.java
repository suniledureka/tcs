package com.tcs.boot.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.boot.rest.bindings.Book;

@RestController
@RequestMapping("/library")
public class LibraryRestController {
	@GetMapping(value = "/book",
			    produces = {"application/json", "application/xml"})
	public ResponseEntity<Book> getBookDetails(){
		//logic to get book details from DB
		Book book =new Book();
		
		book.setBookId(874569);
		book.setBookTitle("Java Complete Reference");
		book.setBookPrice(750.75f);
		
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}    
}
