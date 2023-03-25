package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/multi")
public class Multiplication extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int multi = Integer.parseInt(req.getParameter("num1")) * Integer.parseInt(req.getParameter("num2"));
		int sum = (int)req.getAttribute("sum");
		
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("Sum : " + sum);
		out.println("Multipication : "+multi);
		
	}

}
