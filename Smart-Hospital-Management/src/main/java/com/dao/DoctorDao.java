package com.dao;

import java.sql.*;

import com.entity.Doctor;
import java.util.*;

public class DoctorDao {
	
	private Connection conn;
	
	public DoctorDao(Connection conn) {
		this.conn = conn;
	}
	
	public boolean registerDoctor(Doctor d) {
		
		boolean f= false;
		
		try {
			String sql = "insert into doctor(full_name,dob,qualification,specilist,email,mobno,password) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, d.getFullName());
			ps.setString(2, d.getDob());
			ps.setString(3, d.getQualification());
			ps.setString(4, d.getSpecialist());
			ps.setString(5, d.getEmail());
			ps.setString(6, d.getMobNo());
			ps.setString(7, d.getPassword());
			
			int i = ps.executeUpdate();
			if(i==1)f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}
	
	public List<Doctor> getAllDoctors(){
		List<Doctor> list = new ArrayList<Doctor>();
		
		try {
			String sql = "select * from doctor order by id desc";
			PreparedStatement ps = conn.prepareStatement(sql);
			Doctor d = null;
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				d = new Doctor();
				d.setId(rs.getInt(1));
				d.setFullName(rs.getString(2));
			    d.setDob(rs.getString(3));
				d.setQualification(rs.getString(4));
				d.setSpecialist(rs.getString(5));
				d.setEmail(rs.getString(6));
				d.setMobNo(rs.getString(7));
				d.setPassword(rs.getString(8));
		        list.add(d);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public Doctor getDoctorById(int id) {
		Doctor d = null;
		
		try {
			String sql = "select * from doctor where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeQuery();
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				d = new Doctor();
				d.setId(rs.getInt(1));
				d.setFullName(rs.getString(2));
			    d.setDob(rs.getString(3));
				d.setQualification(rs.getString(4));
				d.setSpecialist(rs.getString(5));
				d.setEmail(rs.getString(6));
				d.setMobNo(rs.getString(7));
				d.setPassword(rs.getString(8));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return d;
	}
	
   public boolean updateDoctor(Doctor d) {
		
		boolean f= false;
		
		try {
			String sql = "update doctor set full_name=?,dob=?,qualification=?,specilist=?,email=?,mobno=?,password=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, d.getFullName());
			ps.setString(2, d.getDob());
			ps.setString(3, d.getQualification());
			ps.setString(4, d.getSpecialist());
			ps.setString(5, d.getEmail());
			ps.setString(6, d.getMobNo());
			ps.setString(7, d.getPassword());
			ps.setInt(8,d.getId());
			
			int i = ps.executeUpdate();
			if(i==1)f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}
   
   public boolean deleteDoctor(int id) {
	   boolean f = false;
	   try {
		   String sql = "delete from doctor where id =?";
		   PreparedStatement ps = conn.prepareStatement(sql);
		   ps.setInt(1, id);
		   int i = ps.executeUpdate();
		   if(i==1)f = true;
		   
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   
	   return f;
   }
   
   public Doctor loginDoctor(String email,String password) {
	   Doctor d = null;
	   
	   try {
		   String sql = "select * from doctor where email=? and password=?";
		   PreparedStatement ps =conn.prepareStatement(sql);
		   
		   ps.setString(1, email);
		   ps.setString(2, password);
		   
		   ResultSet rs = ps.executeQuery();
		   int count = 0;
		   
		   while(rs.next()) {
			    d = new Doctor();
			    d.setId(rs.getInt(1));
			    d.setFullName(rs.getString(2));
			    d.setDob(rs.getString(3));
			    d.setQualification(rs.getString(4));
			    d.setSpecialist(rs.getString(5));
			    d.setEmail(rs.getString(6));
			    d.setMobNo(rs.getString(7));
			    d.setPassword(rs.getString(8));
			    //count+=1;
		   }
		   //System.out.println(email+" --- "+password);
		   
		   
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   
	   
	   return d;
   }

}
