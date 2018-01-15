package com.shiyanlou.demo.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shiyanlou.demo.loosely_coupled.OutputHelper;

public class App {

	private static ApplicationContext context;

    public static void main( String[] args )
    {
//        context = new ClassPathXmlApplicationContext("SpringBeans.xml");
//
//        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
//        obj.printHello();
    	
    	context = new ClassPathXmlApplicationContext(new String[]{"Spring-Output.xml"});
    	
    	OutputHelper helper = (OutputHelper) context.getBean("OutputHelper");
    	helper.generateOutput();
    }
	
}
