package com.tcs.boot.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tcs.boot.web.models.Book;

@Controller
@RequestMapping("/library")
public class LibraryController {
	@GetMapping("/book")
	public String getBookDetails(Model model) {
		Book book = new Book();
		
		book.setBookId(85746);
		book.setBookTitle("Java Complete Reference");
		book.setBookPrice(750.50f);
		
		model.addAttribute("book", book);
		
		return "bookDetails";
	}
	
	@GetMapping("/books")
	public String getBooksDetail(Model model) {
		List<Book> books = new ArrayList<Book>();
		
		Book book1 = new Book(100123, "Java Reference", 575.50f);
		Book book2 = new Book(100124, "Python Reference", 750f);
		Book book3 = new Book(100125, "Microservices Reference", 875.50f);
		Book book4 = new Book(100126, "Spring Boot Reference", 1275.50f);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		
		model.addAttribute("books", books);
		
		return "booksDetail";
	}	
}
