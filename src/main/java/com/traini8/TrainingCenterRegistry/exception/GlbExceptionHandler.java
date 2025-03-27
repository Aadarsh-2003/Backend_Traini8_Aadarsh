package com.traini8.TrainingCenterRegistry.exception;

import java.util.Map;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlbExceptionHandler {
	
	// Handle various errors
    @ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex){
		Map<String, String> errors = new HashMap<>();
	
	
	// collect all errors
	for (FieldError error : ex.getBindingResult().getFieldErrors()) {
		errors.put(error.getField(), error.getDefaultMessage());
	}
	
	return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	
	}
	
	// generic exception
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception ex){
		return new ResponseEntity<>("An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
