package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.db.DBConnect;
import com.entity.User;

@WebServlet("/userlogin")
public class UserLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			HttpSession session = req.getSession();
			UserDAO dao = new UserDAO(DBConnect.getConn());
			User u = dao.login(email, password);
			if(u!=null) {
				session.setAttribute("userObj", u);
				//System.out.println("User login Successfully");
				resp.sendRedirect("index.jsp");
			}else {
				session.setAttribute("erroMsg", "invalid email and password");
				//System.out.println("Something Wrong");
			    resp.sendRedirect("user_login.jsp");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
     
}
