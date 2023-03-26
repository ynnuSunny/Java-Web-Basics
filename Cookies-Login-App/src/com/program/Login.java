package com.program;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      String email = req.getParameter("email");
	      String password = req.getParameter("password");
	      
	      if(email.isEmpty())return;
	      if(password.isEmpty())return;
	      
	      Cookie emailCk = new Cookie("email",email);
	      Cookie passCk = new Cookie("pass",password);
	      resp.addCookie(emailCk);
	      resp.addCookie(passCk);
         
	      resp.sendRedirect("home");
	
	}
     
}
