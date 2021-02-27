package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;


public class JdbcTest {
	
	private static String url;
	private static String username;
	private static String password;
	static {
		
		ResourceBundle bundle = ResourceBundle.getBundle("db");
		url= bundle.getString("db.url");
		username= bundle.getString("db.username");
		password= bundle.getString("db.password");
		
		
	}

	
	/*
	 * 1) Load Driver
	 * 2) create a connection (url,username,password)
	 * 3) create Statement on the connection from step 2
	 * 4) SQL query 
	 * 5) Execute that SQL query using Statement from step 3
	 * 6) in case of Read : ResultSet comes back with Data from DB
	 * 7) close connection and statement
	 * */
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String sql ="Select * from users";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				
				System.out.println(resultSet.getString("username"));
				System.out.println(resultSet.getString("password"));
				System.out.println("****************************");
			}
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
