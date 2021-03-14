package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.repository.UserRepository;
import com.spring.repository.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	
	public List<User> getUsers(){
		
		return repository.getUsers();
	}
	
public User getUserByUsername(String username){
		
		return repository.getUser(username);
	}

public void updatePassword(String username, String password){
	
	 repository.updatePassword(username,password);
}

}
