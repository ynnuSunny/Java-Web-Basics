package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		//getCookies ekta array return kore
		Cookie[] ck = req.getCookies();
		resp.setContentType("text/html");
		
		//amra jehetu ekta cookie rakhsi so 1st index ei thakbe
		out.println(ck[0].getValue());
		out.println("THis is second Servlet");
	}
}
