package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/post_servlet")
public class PostServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String data= req.getParameter("data");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println(data);
		out.println("<a href='get_servlet?data="+data+"'>URL ReWiriting </a>");
	}
     
}
