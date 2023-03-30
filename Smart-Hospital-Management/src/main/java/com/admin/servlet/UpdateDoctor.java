package com.admin.servlet;

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

@WebServlet("/updateDoctor")
public class UpdateDoctor extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Doctor d = new Doctor();
		
		d.setDob(req.getParameter("dob"));
		d.setEmail(req.getParameter("email"));
		d.setFullName(req.getParameter("fullname"));
		d.setMobNo(req.getParameter("mobno"));
		d.setPassword(req.getParameter("password"));
		d.setQualification(req.getParameter("qualification"));
		d.setSpecialist(req.getParameter("spec"));
		d.setId(Integer.parseInt(req.getParameter("id")));
		
		DoctorDao dao = new DoctorDao(DBConnect.getConn());
		
		HttpSession session = req.getSession();
		
		if(dao.updateDoctor(d)) {
			session.setAttribute("sucMsg", "Update Successfully");
		    resp.sendRedirect("admin/doctor.jsp");
		}else {
			 session.setAttribute("errorMsg", "Something wrong on server");
			 resp.sendRedirect("admin/doctor.jsp");
		}
	}
      
}
