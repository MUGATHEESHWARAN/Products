package com.products.gloabalhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.products.customexception.ColorNotFoundException;
@RestControllerAdvice
public class GloabalHandler {
	@ExceptionHandler(ColorNotFoundException.class)
	public ResponseEntity<Object> colorHandle() {
		return new ResponseEntity<Object>("Color Not Available", HttpStatus.BAD_REQUEST);
	}

}
