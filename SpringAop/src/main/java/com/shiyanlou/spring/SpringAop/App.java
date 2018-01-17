package com.shiyanlou.spring.SpringAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shiyanlou.spring.aop.advice.CustomerService;

public class App 
{
	static ApplicationContext context;
	
    public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("SpringAOPAdvice.xml");
        
        CustomerService cs = (CustomerService) context.getBean("customerService");
        
        cs.printName();
        cs.printUrl();
        try {
        	cs.printThrowException();
        } catch (Exception e){}
    }
}
