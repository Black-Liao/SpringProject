package com.shiyanlou.spring.aop.aspectj;

public interface ICustomerBo {

	void addCustomer();
	void deleteCustomer();
	String addCustomerRetrunValue();
	void addCustomerThrowException() throws Exception;
	void addCustomerAround(String name);
	
}
