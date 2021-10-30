package com.example.demo.resourceNotFoundExeception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value= HttpStatus.NOT_FOUND)

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String resourcename;
	private String fieldName;
	private Object fielValue;
	
	public ResourceNotFoundException(String resourcename, String fieldName, Object fielValue) {
		
		super(String.format("%s not found whith %s: '%s'", resourcename,fieldName,fielValue));
		this.resourcename = resourcename;
		this.fieldName = fieldName;
		this.fielValue = fielValue;
	}

	public String getResourcename() {
		return resourcename;
	}


	public String getFieldName() {
		return fieldName;
	}

	public Object getFielValue() {
		return fielValue;
	}
	
	
}
