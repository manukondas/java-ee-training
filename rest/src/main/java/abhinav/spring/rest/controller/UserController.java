package abhinav.spring.rest.controller;

import java.util.List;
import abhinav.spring.rest.repository.User;
import abhinav.spring.rest.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		
		
		return service.getUsers();
		
	}

}
