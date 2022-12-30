package com.tcs.boot.web.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
	@GetMapping(value = {"/","/productentry"})
	public String loadProductEntryForm() {
		return "index";
	}
	
	@PostMapping("/saveproduct")
	public String handleSubmitButtonClick(HttpServletRequest request, Model model) {
		String pid = request.getParameter("pid");
		String pname = request.getParameter("pname");
		String pprice = request.getParameter("pprice");
		
		Map<String, String> attributes = new HashMap<String, String>();
		attributes.put("id", pid);
		attributes.put("name", pname);
		attributes.put("price", pprice);
		attributes.put("message", "Product Added to Stock!!!");
		
		model.addAllAttributes(attributes);
		
		return "success";
	}
}