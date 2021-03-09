package com.spring.jdbc;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserServiceTest {
	
		
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		UserService userService = (UserService)context.getBean(UserService.class);
		List<User> users = userService.getUsers();
		for(User user:users) {
			System.out.println("Username : "+user.getUsername()+" Password: "+user.getPassword());
		}
		User user = new User("spring", "jdbcUpdated");
		
		userService.deleteUser(user);
		//userService.createUser(user);
		System.out.println("******************");
		User user2 = userService.getUserByUsername("spring");
		System.out.println("Username : "+user2.getUsername()+" Password: "+user2.getPassword());
		
		
	}

}
