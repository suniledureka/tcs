package com.tcs.boot.web.controllers;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.boot.web.dao.BooksDAO;
import com.tcs.boot.web.models.Book;

@Controller
@RequestMapping("/library")
public class LibraryController {
	@GetMapping("/book/{isbn}")
	public String getBookDetails(@PathVariable("isbn") Integer isbn, Model model) {
		Book bk = new Book();
		
		List<Book> books = BooksDAO.getAllBooks();
		int flag = 0;
		
		for(Book book : books) {
			if(book.getBookId().equals(isbn)) {				
				bk.setBookId(isbn);
				bk.setBookTitle(book.getBookTitle());
				bk.setBookPrice(book.getBookPrice());
				
				flag=1;
				break;
			}						
		}
		
		model.addAttribute("book", bk);
		
		if(flag == 0) {
			if(isbn==0)
				model.addAttribute("error_msg", "please provide ISBN number as a Query Parameter");
			else
				model.addAttribute("error_msg", "no matching book found for ISBN: " + isbn);
		}
				
		
		return "bookDetails";
	}
}
