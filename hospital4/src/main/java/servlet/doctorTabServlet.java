package servlet;

import java.io.IOException;

import conn.jdbcConnect;
import dao.DoctorDAO;

import entity.Doctor;

//import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class doctorTabServlet extends HttpServlet {
	boolean f=false;



	private static final long serialVersionUID = 1L;


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email").toLowerCase();
		String password=req.getParameter("password");
		
		
		Doctor doctor=null;
		
		try {
			doctor=new Doctor();
			DoctorDAO dao = new DoctorDAO(jdbcConnect.getConn());

			doctor=dao.getDoctorByEmail(email);
		

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		 if(password.equals(doctor.getPassword()) ){  
			 	String email1=email;
			    req.setAttribute("email1",email);
		        RequestDispatcher rd=req.getRequestDispatcher("/doctorTab.jsp");  
		        rd.forward(req, resp);  
		    }  
		    else{  
		        System.out.print("Sorry Email or Password Error!");  
		        RequestDispatcher rd=req.getRequestDispatcher("/doctorLogin.jsp");  
		        rd.include(req, resp);  
		                      
		        }  
		

	}

}
