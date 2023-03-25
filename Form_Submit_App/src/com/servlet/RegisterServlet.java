package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
    
	String user_name;
	String email;
	String  password;
	String course;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		this.user_name = req.getParameter("user_name");
		this.email = req.getParameter("email");
		this.password = req.getParameter("password");
		this.course = req.getParameter("course");
	    
		PrintWriter out = resp.getWriter();
		out.println("User Name : "+this.user_name);
		out.println("User Email : "+this.email);
		out.println("User Course : "+this.course);
		
		
	
	
	}
   
	
}
