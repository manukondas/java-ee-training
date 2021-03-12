package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.repository.User;
import com.spring.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;

	@GetMapping
	@RequestMapping("/users")
	public String getUsers(HttpServletRequest request) {
		List<User> users = service.getUsers();
		request.setAttribute("users", users);
		
		return "users";
	}
	
	
	@GetMapping
	@RequestMapping("/editUser")
	public String getUsers(HttpServletRequest request, @RequestParam String username) {
		User user = service.getUserByUsername(username);
		request.setAttribute("user", user);
		
		return "editUsers";
	}
}
