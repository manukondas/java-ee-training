package abhinav.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abhinav.spring.rest.repository.User;
import abhinav.spring.rest.repository.UserRepository;


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

public boolean isValidLogin(String username, String password) {
	
	User user = repository.getUser(username);
	
	return password.equalsIgnoreCase(user.getPassword());
	
	
}

}
