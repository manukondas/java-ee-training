package com.spring.core;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/core/spring-core.xml");
		
		Student student = (Student)ctx.getBean("student");
		System.out.println(student.getId());
		System.out.println(student.getName());
		
	
		Address address = student.getAddress();
		System.out.println(address.getAddressLane());
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getZip());
		
		for(Entry<String, Integer> marks: student.getMarks().entrySet()) {
			System.out.println(marks.getKey());
			System.out.println(marks.getValue());
		}
		
		System.out.println("closing context");
		((ConfigurableApplicationContext)ctx).close();
		
	}
}
