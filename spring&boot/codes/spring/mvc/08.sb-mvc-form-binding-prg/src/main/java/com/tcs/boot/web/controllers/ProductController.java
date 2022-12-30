package com.tcs.boot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.boot.web.bindings.Product;

@Controller
public class ProductController {
	@GetMapping(value = {"/","/productentry"})
	public String loadProductEntryForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		
		return "index";
	}
	
	@PostMapping("/saveproduct")
	public String handleSubmitButtonClick(Product product, Model model) {
		//save the product to data store
		System.out.println(product);
		return "redirect:/productsaved";
	}
	
	@GetMapping("/productsaved")
	public String productSavingSuccess(Model model) {
		model.addAttribute("message", "Product Details are saved to Stock!!!");	
		model.addAttribute("product", new Product());
		return "index"; 
	}
}