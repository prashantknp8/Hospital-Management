package dao;

import java.sql.Connection; 

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import entity.Patient;

public class PatientDAO {
	private Connection conn;





	public PatientDAO(Connection conn) {
		super();
		this.conn = conn;
	}


	public boolean addPatient(Patient patient) {


		boolean f=false;
		try {
			String sql="insert into appointments(patientName,doctorId,appointmentDate,age,email)values (?,?,?,?,?)";

			PreparedStatement pre=conn.prepareStatement(sql);

			pre.setString(1,patient.getName());
			pre.setInt(2,Integer.parseInt(patient.getDocName()));
			pre.setString(3,patient.getDate());
			pre.setInt(4,patient.getAge());
			pre.setString(5,patient.getEmail().toLowerCase());
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
	
	
	
	public List<Patient> getAllPatient(){
		List<Patient> list=new ArrayList<Patient>();
		Patient patient=null;
		try { 
			String sql="select * from appointments";
			PreparedStatement pre=conn.prepareStatement(sql);
			ResultSet rs=pre.executeQuery();
			
			while(rs.next()) {
				patient=new Patient();
				patient.setName(rs.getString(2));
				patient.setDocName(getDocNameById(rs.getInt(3)));
				patient.setAge(rs.getInt(5));
				patient.setDate(rs.getString(4));
				patient.setEmail(rs.getString(6));
				list.add(patient);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Patient> getAllPatientOfDoctor(String email){
		List<Patient> list=new ArrayList<Patient>();
		Patient patient=null;
		int id= getDocIdByEmail(email);
		try { 
			String sql="select * from appointments where doctorId= ?";
			PreparedStatement pre=conn.prepareStatement(sql);
			pre.setInt(1,id);
			ResultSet rs=pre.executeQuery();
			
			while(rs.next()) {
				patient=new Patient();
				patient.setName(rs.getString(2));
				patient.setAge(rs.getInt(5));
				patient.setDate(rs.getString(4));
				patient.setEmail(rs.getString(6));
				list.add(patient);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	public String getDocNameById(int id) {
		String name="";
		try {
			String sql="select * from doctors where doctorId = ? ";
			PreparedStatement pre=conn.prepareStatement(sql);
			pre.setInt(1,id);
			ResultSet rs=pre.executeQuery();
			
			if (rs.next()) {
                name = rs.getString(2);
            } 
			
		}
	
	catch(SQLException e) {
		e.printStackTrace();
	} 
	return name;
	}
	
	public int getDocIdByEmail(String email) {
		int id=0;
		try {
			String sql="select * from doctors where doctorEmail = ? ";
			PreparedStatement pre=conn.prepareStatement(sql);
			pre.setString(1,email);
			ResultSet rs=pre.executeQuery();
			
			if (rs.next()) {
                id = rs.getInt(1);
            } 
			
		}
	
	catch(SQLException e) {
		e.printStackTrace();
	} 
	return id;
	}
	
	
}
