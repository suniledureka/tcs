package com.tcs.boot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	public ModelAndView showWelcomeMessage() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome to Tata Consultancy Services");
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping("/greet")
	public ModelAndView showGreetingMessage() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Greetings from Tata Consultancy Services");
		mav.setViewName("index");
		
		return mav;
	}	
}
