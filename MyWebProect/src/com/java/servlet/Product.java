package com.java.servlet;

public class Product {
	
	String name;
	int qty;
	double price;

	public Product(String name, int qty, double price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public double getPrice() {
		return price;
	}
	
}
