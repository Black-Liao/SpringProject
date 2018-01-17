package com.shiyanlou.spring.aop.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HiJackAroundMethod implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {

		System.out.println("Method name is :" + invocation.getMethod().getName());
		System.out.println("Method argument is : " + Arrays.toString(invocation.getArguments()));

		System.out.println("Before");
		try {
			Object result = invocation.proceed();

			System.out.println("After");

			return result;
		} catch (Exception e) {
			System.out.println("Throw Exception");
			throw e;
		}
	}

}
