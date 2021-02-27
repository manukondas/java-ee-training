package com.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.servlet.User;

public class UserService {
	
	
	public static List<User> getUsers(){
		
		List<User> users = new ArrayList<User>();
		
		Connection connection = DBConnector.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			String sql ="Select * from users";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				
				User user = new User(resultSet.getString("username"), resultSet.getString("password"));
				users.add(user);
			}
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		return users;
		
	}
	
	
	public static User getUser(String username) {
		User user = null;
		
		Connection connection = DBConnector.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			String sql ="Select * from users where username='"+username+"'";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				
				 user = new User(resultSet.getString("username"), resultSet.getString("password"));
				
			}
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	
}
