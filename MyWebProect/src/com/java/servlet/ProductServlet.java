package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet{
	
	 List<Product> products ;
	@Override
	public void init() throws ServletException {
		products = new ArrayList<Product>();
		products.add(new Product("TV", 3, 300.0));
		products.add(new Product("Cell", 5, 200.0));
		products.add(new Product("Battery", 10, 30.0));
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
				Cookie[] cookies = req.getCookies();
		
		for(Cookie cookie:cookies) {
	
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
			System.out.println(cookie.getDomain());
			System.out.println(cookie.getMaxAge());
			
		}
		
		Cookie cookie1 = new Cookie("siva", "website");
		cookie1.setMaxAge(89600);
			resp.addCookie(cookie1);	

		
		req.setAttribute("abhinavProducts", products);
		
		req.getRequestDispatcher("products.jsp").forward(req, resp);
		
		
	}
	

}
