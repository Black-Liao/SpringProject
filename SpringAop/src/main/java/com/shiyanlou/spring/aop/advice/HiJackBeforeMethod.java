package com.shiyanlou.spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HiJackBeforeMethod implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("HiJackBeforeMethod: before HiJack");
		
	}

	
	
}
