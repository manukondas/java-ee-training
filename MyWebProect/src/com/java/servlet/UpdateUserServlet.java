package com.java.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.jdbc.UserService;

public class UpdateUserServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		User user = UserService.getUser(username);
		
		req.setAttribute("user", user);
		
		req.getRequestDispatcher("updateUser.jsp").forward(req, resp);
		
		
		
	}

}
