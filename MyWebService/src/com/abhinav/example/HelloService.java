package com.abhinav.example;

public class HelloService {
	
	String helloTemplate = "Hello Mr. %s";

	public String sayHello(String name) {
		
		return String.format(helloTemplate, name);
	}
	
}
