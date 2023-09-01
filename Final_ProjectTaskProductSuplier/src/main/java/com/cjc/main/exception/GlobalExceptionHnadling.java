package com.cjc.main.exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHnadling 
{
	@ExceptionHandler(ProductNotFondException.class)
	public ResponseEntity<Map<String, Object>> ProductNotFondException(ProductNotFondException a , HttpServletRequest request) 
	{
		/*
		 * Apierror error=new Apierror(HttpStatus.NOT_FOUND.value(), a.getMessage(),new
		 * Date(),HttpStatus.NOT_FOUND, request.getRequestURL()); return error;
		 */
	
	Map<String , Object> map=new HashMap<>();
	map.put("message", a.getMessage());
	map.put("httpstatus", HttpStatus.NOT_FOUND);
	map.put("date", new Date());
	map.put("requestUrl",request.getRequestURI());
	
	return ResponseEntity.status(HttpStatus.OK).body(map);
	
	
	
	}


}

