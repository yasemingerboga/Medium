package com.atmosware.unitTestingDemo.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({ BusinessException.class })
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public String handleBusinessException(BusinessException businessException) {
		Map<String, String> businessErrors = new HashMap<String, String>();
		businessErrors.put(businessException.getMessage(), "Business.Exception");

		return businessException.getMessage();
	}

}
