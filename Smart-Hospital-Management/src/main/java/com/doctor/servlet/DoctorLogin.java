package com.doctor.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DoctorDao;
import com.db.DBConnect;
import com.entity.Doctor;

@WebServlet("/doctorLogin")
public class DoctorLogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		DoctorDao dao = new DoctorDao(DBConnect.getConn());
		
		 HttpSession session = req.getSession();
		 Doctor d = dao.loginDoctor(email,password);
			
		if(d!=null) {
			session.setAttribute("doctObj", d);
			//session.setAttribute("sucMsg", "Login Successfully");
			resp.sendRedirect("doctor/index.jsp");
		}else {
			System.out.println("Problem Find");
			session.setAttribute("errorMsg", "Invalid Email and Password");
			resp.sendRedirect("doctor_login.jsp");
		}
		
	}
   
} 
