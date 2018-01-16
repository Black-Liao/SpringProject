package com.shiyanlou.spring.customer.services;

public class CustomerService {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "CustomerService [message=" + message + "]";
	}
	
}
