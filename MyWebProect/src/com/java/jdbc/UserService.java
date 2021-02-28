package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		PreparedStatement statement;
		try {
			String sql ="Select * from users";
			statement = connection.prepareStatement(sql);
			
			ResultSet resultSet = statement.executeQuery();
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
		PreparedStatement statement;
		try {
			String sql ="Select * from users where username=?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, username);
			ResultSet resultSet = statement.executeQuery();
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
	
	
	public static void createUser(String username, String password) {
		
		Connection connection = DBConnector.getConnection();
		PreparedStatement statement;
		
		User user = getUser(username);
		
		if(user == null) {
		try {
			String sql ="insert into users values (?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, username);
			statement.setString(2, password);
			statement.execute();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	
public static void updatePassword(String username, String newPassword) {
		
		Connection connection = DBConnector.getConnection();
		PreparedStatement statement;
		
		User user = getUser(username);
		
		if(user != null) {
		try {
			String sql ="update users set password=? where username=?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, newPassword);
			statement.setString(2, username);
			statement.execute();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

public static void deleteUser(String username) {
	
	Connection connection = DBConnector.getConnection();
	PreparedStatement statement;
	
	try {
		String sql ="delete from users where username=?";
		statement = connection.prepareStatement(sql);
		statement.setString(1, username);
		statement.execute();
		connection.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

public static boolean isLoginSuccess(String username, String password) {
	
	
	User user = getUser(username);
	
	if(user != null) {
		
		return password.equals(user.getPassword());
	}
	
	return false;
	
	
}
	
}

	

