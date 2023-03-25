package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Servlet1 extends HttpServlet{
    
	String email;
	String password;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		this.email = req.getParameter("email");
		this.password = req.getParameter("password");
		
		
		PrintWriter out = resp.getWriter();
		
		RequestDispatcher rd;
		
	     if(this.email.equals("demo@gmail.com") && this.password.equals("demo")) {
	    	 //can go home page
	    	 rd = req.getRequestDispatcher("/homeServlet");
	         rd.forward(req, resp);	 
	     }else {
	    	 //can't do try again
	    	 out.println("Wrong Password/Email!!");
	    	 rd = req.getRequestDispatcher("/index.html");
	    	 rd.include(req, resp);
	     }
	
	}
	
	

}
