package com.spring.core;

public class Address {
	
	private String addressLane;
	private String city;
	private String state;
	private String zip;
	public String getAddressLane() {
		return addressLane;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public Address(String addressLane, String city, String state, String zip) {
		super();
		this.addressLane = addressLane;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
}
