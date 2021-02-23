package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
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
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<th>");
		out.println("Name");
		out.println("</th>");
		out.println("<th>");
		out.println("Qty");
		out.println("</th>");
		out.println("<th>");
		out.println("Price");
		out.println("</th>");
		out.println("</tr>");
		for(Product product:products) {
			out.println("<tr>");
			out.println("<td>");
			out.println(product.getName());
			out.println("</td>");
			out.println("<td>");
			out.println(product.getQty());
			out.println("</td>");
			out.println("<td>");
			out.println(product.getPrice());
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}
	

}
