package com.dao;

import java.sql.*;

import com.entity.User;

public class UserDAO {
      
	private Connection conn;

	public UserDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean userRegister(User u) {
		boolean f = false;
		
		try {
			String sql = "insert into user_details(full_name,email,password) values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u.getFullname());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPassword());
			//ps.setInt(4, 1);
			
			int i = ps.executeUpdate();
			if(i==1)f = true;
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}
	
}
