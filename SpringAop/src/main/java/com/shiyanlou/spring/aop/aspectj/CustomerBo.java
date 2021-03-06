package com.shiyanlou.spring.aop.aspectj;

public class CustomerBo implements ICustomerBo {

	public void addCustomer() {
		System.out.println("addCustomer() is running...");
	}

	public void deleteCustomer() {
		System.out.println("deleteCustomer() is running...");
	}

	public String addCustomerRetrunValue() {
		System.out.println("addCustomerRetrunValue() is running...");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running...");
		throw new Exception("test Exception");
	}

	public void addCustomerAround(String name) {
		System.out.println("addCustomer() is running... arg :" + name);
	}

}
