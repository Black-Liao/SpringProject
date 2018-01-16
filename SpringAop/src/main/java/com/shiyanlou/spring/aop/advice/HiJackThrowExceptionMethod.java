package com.shiyanlou.spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class HiJackThrowExceptionMethod implements ThrowsAdvice {

	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HiJackThrowException : throw exception hi jack");
	}
	
}
