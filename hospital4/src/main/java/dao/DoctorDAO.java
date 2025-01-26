package dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Doctor;

public class DoctorDAO {
	private Connection conn;
	
	public DoctorDAO(Connection conn) {
		super();
		this.conn=conn;
		}
	

	public boolean addDoctor(Doctor doctor) {


		boolean f=false;
		try {
			String sql="insert into doctors(doctorName,doctorEmail,speciality,phoneNumber)values (?,?,?,?)";

			PreparedStatement pre=conn.prepareStatement(sql);

			pre.setString(1,doctor.getName());
			pre.setString(2,doctor.getEmail());
			pre.setString(3,doctor.getSpecialisation());
			pre.setString(4,doctor.getNumber());
			pre.setString(5,doctor.getPassword());
			int i=pre.executeUpdate();

			if(i==1) {
				f=true;
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
//	
//	
	public List<Doctor> getAllDoctor(){
		List<Doctor> list=new ArrayList<Doctor>();
		Doctor doctor=null;
		try { 
			String sql="select * from doctors";
			PreparedStatement pre=conn.prepareStatement(sql);
			ResultSet rs=pre.executeQuery();
			
			while(rs.next()) {
				doctor=new Doctor();
				doctor.setName(rs.getString(2));
				doctor.setEmail(rs.getString(3).toLowerCase());
				doctor.setSpecialisation(rs.getString(4));
				doctor.setNumber(rs.getString(5));
				doctor.setPassword(rs.getString(6));
				list.add(doctor);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	 public Doctor getDoctorByEmail(String email) {
		 Doctor doctor=new Doctor();
		
		try { 
			String sql="SELECT * FROM doctors WHERE doctorEmail = ?";
			PreparedStatement pre=conn.prepareStatement(sql);
			pre.setString(1,email);
			ResultSet rs=pre.executeQuery();
			
			while(rs.next()) {
				
				doctor.setName(rs.getString(2));
				doctor.setEmail(rs.getString(3));
				doctor.setSpecialisation(rs.getString(4));
				doctor.setNumber(rs.getString(5));
				doctor.setPassword(rs.getString(6));
				
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return doctor;
		
	}
//	
}
