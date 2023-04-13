package com.wipro.demo.exception;

import lombok.AllArgsConstructor;


public class EmployeeNotFoundException extends Exception {

	String message;
	public EmployeeNotFoundException(String message)
	{
		super(message);
		this.message=message;
		
	}
}
