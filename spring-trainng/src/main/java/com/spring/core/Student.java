package com.spring.core;

import java.util.Map;

public class Student {
	
	private String id;
	private String name;
	private Address address;
	private Map<String, Integer> marks;
	
	public Student() {
		System.out.println("Student object is getting created");
	}
	
	

	public Student(String id, String name, Address address, Map<String, Integer> marks) {
		System.out.println("Constructor is being called");
		this.id = id;
		this.name = name;
		this.address= address;
		this.marks= marks;
	}



	public Map<String, Integer> getMarks() {
		return marks;
	}



	public Address getAddress() {
		return address;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}



	void init() {
		System.out.println("initialising");
	}

	void destroy() {
		System.out.println("destroy is called");
	}
}
