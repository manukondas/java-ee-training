package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.UserModel;
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
	public String editUser(HttpServletRequest request, @RequestParam String username, Model model) {
		User user = service.getUserByUsername(username);
		
		model.addAttribute("userModel", buildModel(user));
		
		return "editUsers";
	}
	
	private UserModel buildModel(User user) {
		
		UserModel model = new UserModel();
		model.setUsername(user.getUsername());
		model.setPassword(user.getPassword());
		return model;
	}


	@PostMapping
	@RequestMapping("/submitUser")
	public String updateUser( @ModelAttribute("userModel") @Valid  UserModel userModel, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("error", "true");
			return "editUsers";
		}
		
		service.updatePassword(userModel.getUsername(), userModel.getPassword());
		
		return "redirect: users";
	}
}
