package com.spring.aop;

public class ExceptionAspect
{
	 public void logAfterThrowingAllMethods(Exception ex) throws Throwable 
	    {
	        System.out.println("****LoggingAspect.logAfterThrowingAllMethods() " + ex);
	    }
}