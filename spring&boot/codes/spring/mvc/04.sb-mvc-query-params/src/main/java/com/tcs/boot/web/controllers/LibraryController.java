package com.tcs.boot.web.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.boot.web.dao.BooksDAO;
import com.tcs.boot.web.models.Book;

@Controller
@RequestMapping("/library")
public class LibraryController {
	@GetMapping("/book")
	//public String findBookById(@RequestParam("bid") Integer bid, Model model) {
	public String findBookById(@RequestParam(value = "bid", required = false, defaultValue = "0") Integer bid, Model model) {
		List<Book> books = BooksDAO.getAllBooks();
		Book bk = new Book();
		
		int flag = 0;
		
		for(Book book : books) {
			if(book.getBookId().equals(bid)) {				
				bk.setBookId(bid);
				bk.setBookTitle(book.getBookTitle());
				bk.setBookPrice(book.getBookPrice());
				
				flag=1;
				break;
			}						
		}
		
		model.addAttribute("book", bk);
		
		if(flag == 0) {
			if(bid == 0)
				model.addAttribute("err_msg", "please provide BID number as a Query Parameter");
			else
				model.addAttribute("err_msg", "no matching book found for ISBN: " + bid);
		}		
		
		/*
		Optional<Book> searchBookResult = books.stream().filter(book -> book.getBookId().equals(bid)).findAny();
		
		if(searchBookResult.isPresent()) {
			Book bk = searchBookResult.get();
			model.addAttribute("book", bk);
		}else {
			model.addAttribute("err_msg", "no matching book in library with ISBN: "+bid);
		}		
		*/
		
		
		return "bookDetails";
	}
}
