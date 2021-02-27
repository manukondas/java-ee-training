package com.java.jdbc;

import java.util.List;

import com.java.servlet.User;

public class UserServiceTest {
	
	public static void main(String[] args) {
		
		List<User> users = UserService.getUsers();
		
		for(User user:users) {
			System.out.println("Username : "+user.getUsername()+ " Password: "+user.getPassword());
		}
		
		
		System.out.println("**********^^^^^^^^^^^***********");
		User user = UserService.getUser("siva");
		System.out.println("Username : "+user.getUsername()+ " Password: "+user.getPassword());
	}
	


}
