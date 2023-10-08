package com.edubridge.exception;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//public class GlobalExceptionhandler {
	@ControllerAdvice
	public class GlobalExceptionhandler extends ResponseEntityExceptionHandler{

		@Override
		protected ResponseEntity<Object> handleMethodArgumentNotValid(
				MethodArgumentNotValidException ex,
				HttpHeaders headers,HttpStatus status,WebRequest request){
		
			Map<String,String> errors=new HashMap<>();
			ex.getBindingResult().getAllErrors().forEach((error)->{
				String fieldName=((FieldError) error).getField();
				String message=error.getDefaultMessage();
				errors.put(fieldName, message);
				
			});
			return new ResponseEntity<Object> (errors,HttpStatus.BAD_REQUEST);
		}
		//@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
		 @ExceptionHandler(ResourceNotfoundexception.class)
		 public
		  ResponseEntity<String>
		  handleCustomerNotFoundException(ResourceNotfoundexception
		  resourceNotFoundException) { 
			 System.out.println("inside global exception handling");
			 return new
		  ResponseEntity<String>(resourceNotFoundException.getMessage(),HttpStatus.BAD_REQUEST);
		  }
		 
		 
	}

