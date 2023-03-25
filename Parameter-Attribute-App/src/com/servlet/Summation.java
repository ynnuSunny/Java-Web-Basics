package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class Summation extends HttpServlet {
	
	private int num1;
	private int num2;
	private int sum;
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		this.num1 = Integer.parseInt(req.getParameter("num1")) ;
		this.num2 = Integer.parseInt(req.getParameter("num2"));
		this.sum = num1+num2;
		
		req.setAttribute("sum", sum); //req er notun arekta attribute add kortesi
		
		RequestDispatcher rd = req.getRequestDispatcher("/multi");
		
		rd.forward(req, resp);
		
		
	}
	
	

}
