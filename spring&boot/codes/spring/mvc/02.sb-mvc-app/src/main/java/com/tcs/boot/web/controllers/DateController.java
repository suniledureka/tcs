package com.tcs.boot.web.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DateController {
	//@RequestMapping("/date")
	//@RequestMapping(value = {"/date","/today"})
	//@RequestMapping(value = {"/date","/today"}, method = RequestMethod.GET)
	@GetMapping(value = {"/date","/today"})
	public ModelAndView showTodaysDate() {
		ModelAndView mav = new ModelAndView();
		
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy::HH:mm:ss");
		String today = formatter.format(d);
		mav.addObject("date", today);
		
		mav.setViewName("date");
		return mav;
	}
}