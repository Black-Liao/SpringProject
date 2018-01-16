package com.shiyanlou.spring.SpringAuto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shiyanlou.spring.services.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
	static ApplicationContext context;
	
    public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("SpringCustomer.xml");
        CustomerService cs = (CustomerService) context.getBean("customerService");
        
        System.out.println(cs.toString());
        
    }
}
