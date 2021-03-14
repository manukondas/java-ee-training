package com.spring.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		
		return new JdbcTemplate(dataSource);
	}
	
	public List<User> getUsers() {
		
		return jdbcTemplate.query("Select * from users", new UserMapper());
	}

	public User getUser(String username){
		
		
		User user = (User) jdbcTemplate.queryForObject("Select * from users where username=?", new Object[] {username}, new UserMapper());
		
			
			return user;
			
		}
	
	public void updatePassword(String username, String password){
		
		
		 jdbcTemplate.update("update users set password=? where username=?", new Object[] {password,username});
		
			
	
			
		}
}
