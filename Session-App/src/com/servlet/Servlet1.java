package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String data = req.getParameter("data");
		PrintWriter out = resp.getWriter();
		
		//Creating Cookies
		Cookie ck = new Cookie("data",data);
		resp.addCookie(ck);
		
		resp.setContentType("text/html");
		out.println("Name : "+data);
		out.println("<a href='servlet2'>Go to 2nd Servlet</a>");
	}
	

}
