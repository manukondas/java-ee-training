package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnector {
	
	private static String url;
	private static String username;
	private static String password;
	static {
		
		ResourceBundle bundle = ResourceBundle.getBundle("db");
		url= bundle.getString("db.url");
		username= bundle.getString("db.username");
		password= bundle.getString("db.password");
		
		
	}
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection(url, username, password);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	

}
