package com.java.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.jdbc.UserService;

public class UserServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<User> users = UserService.getUsers();
		
		req.setAttribute("users", users);
		
		req.getRequestDispatcher("users.jsp").forward(req, resp);
		
		
		
	}

}
