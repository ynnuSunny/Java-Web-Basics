package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] ck = req.getCookies();
		if(ck!=null) {
			 resp.setContentType("text/html");
			 PrintWriter out = resp.getWriter();
			 
			 out.println(ck[0].getValue());
			 
			 out.println("<a href ='logout'> Logout</a>");
		}else {
			resp.sendRedirect("index.html");
		}
	}
	

}
