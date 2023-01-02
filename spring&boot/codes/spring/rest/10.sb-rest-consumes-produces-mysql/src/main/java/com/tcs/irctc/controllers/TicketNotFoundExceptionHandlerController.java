package com.tcs.irctc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tcs.irctc.exceptions.TicketNotFoundException;
import com.tcs.irctc.models.ApiError;

@RestControllerAdvice
public class TicketNotFoundExceptionHandlerController {
	/*
	@ExceptionHandler(value = TicketNotFoundException.class)
	public ResponseEntity<String> handleTicketNotFoundException(Exception ex){
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	*/
	
	@ExceptionHandler(value = TicketNotFoundException.class)
	public ResponseEntity<ApiError> handleTicketNotFoundException(Exception ex){
		ApiError error = new ApiError();
		
		error.setErrorMessage(ex.getMessage());
		error.setErrorDate(new SimpleDateFormat("MM/dd/yyyy").format(new Date()));
		//error.setErrorType(ex.getClass().getSimpleName());
		error.setErrorType(ex.getClass().getName());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}	
}
