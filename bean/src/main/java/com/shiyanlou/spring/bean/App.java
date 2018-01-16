package com.shiyanlou.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shiyanlou.spring.customer.services.CustomerService;
import com.shiyanlou.spring.innerbean.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext context;
	
    public static void main( String[] args )
    {
        
    	context = new ClassPathXmlApplicationContext("SpringCollections.xml");
    	
//    	FileNameGenerator generator = (FileNameGenerator) context.getBean("FileNameGenerator");
//    	
//    	generator.printFileName();
    	
//    	Customer customer = (Customer) context.getBean("CustomerBean");
//    	
//    	System.out.println(customer.toString());
    	
//    	CustomerService cs1 = (CustomerService) context.getBean("CustomerService");
//    	
//    	cs1.setMessage("test scope");
//    	System.out.println(cs1.getMessage());
//    	
//    	CustomerService cs2 = (CustomerService) context.getBean("CustomerService");
//    	
//    	System.out.println(cs2.getMessage());
    	
    	com.shiyanlou.spring.collection.Customer lists = (com.shiyanlou.spring.collection.Customer) context.getBean("customerBean");    	
    	System.out.println(lists.getLists().toString());
    	
    	com.shiyanlou.spring.collection.Customer maps = (com.shiyanlou.spring.collection.Customer) context.getBean("customerBean");    	
    	System.out.println(maps.getMaps().toString());

    	com.shiyanlou.spring.collection.Customer sets = (com.shiyanlou.spring.collection.Customer) context.getBean("customerBean");    	
    	System.out.println(sets.getSets().toString());

    	com.shiyanlou.spring.collection.Customer pro = (com.shiyanlou.spring.collection.Customer) context.getBean("customerBean");    	
    	System.out.println(pro.getProperties().toString());

    	
    }
}
