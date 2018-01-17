package com.shiyanlou.spring.SpringAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shiyanlou.spring.aop.advice.CustomerService;
import com.shiyanlou.spring.aop.aspectj.CustomerBo;
import com.shiyanlou.spring.aop.aspectj.ICustomerBo;

public class App 
{
	static ApplicationContext context;
	
    public static void main( String[] args )
    {
//        context = new ClassPathXmlApplicationContext("SpringAOPAdvice.xml");
//        
//        CustomerService cs = (CustomerService) context.getBean("customerService");
//        
//        cs.printName();
//        cs.printUrl();
//        try {
//        	cs.printThrowException();
//        } catch (Exception e){}
    	
    	context = new ClassPathXmlApplicationContext("SpringAOPAspectj.xml");
    	
    	ICustomerBo cb = (ICustomerBo) context.getBean("customerBo");
    	
    	cb.addCustomer();
    	
    	cb.deleteCustomer();
    	
    	cb.addCustomerAround("test");
    	
    }
}
