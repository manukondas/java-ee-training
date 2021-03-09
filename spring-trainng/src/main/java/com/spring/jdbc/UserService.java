package com.spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserService {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<User> getUsers(){
		
		List<User> users = jdbcTemplate.query("Select * from users", new UserMapper());
		
		return users;
		
	}
	
	public User getUserByUsername(String username){
		
		
	User user = (User) jdbcTemplate.queryForObject("Select * from users where username=?", new Object[] {username}, new UserMapper());
	
		
		return user;
		
	}
	
	public void createUser(User user) {
		
		jdbcTemplate.update("insert into users values(?,?)",new Object[] {user.getUsername(),user.getPassword()});
	}


	public void updateUser(User user) {
		
		jdbcTemplate.update("update users set password=? where username=?",new Object[] {user.getPassword(),user.getUsername()});
	}
	
public void deleteUser(User user) {
		
		jdbcTemplate.update("delete  from users where username=?",new Object[] {user.getUsername()});
	}
}
