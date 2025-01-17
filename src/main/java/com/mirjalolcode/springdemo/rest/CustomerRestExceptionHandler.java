package com.mirjalolcode.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	// add an exception handler for CustomerNotFoundException
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException exc){
		// create a CustomerErrorResponse
		CustomerErrorResponse error=new CustomerErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				exc.getMessage(),
				System.currentTimeMillis());
		
		// return ResponseEntity
		return new ResponseEntity<CustomerErrorResponse>(error, HttpStatus.NOT_FOUND);
	}
	
	// add another exception handler... to catch any exception (catch all)
	// add an exception handler for CustomerNotFoundException
		@ExceptionHandler
		public ResponseEntity<CustomerErrorResponse> handleException(Exception exc){
			// create a CustomerErrorResponse
			CustomerErrorResponse error=new CustomerErrorResponse(
					HttpStatus.BAD_REQUEST.value(),
					exc.getMessage(),
					System.currentTimeMillis());
			
			// return ResponseEntity
			return new ResponseEntity<CustomerErrorResponse>(error, HttpStatus.BAD_REQUEST);
    }
}