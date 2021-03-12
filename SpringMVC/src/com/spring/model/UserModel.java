package com.spring.model;

import javax.validation.constraints.Size;

public class UserModel {
	
	private String username;
	@Size(min=2, max=8)
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
