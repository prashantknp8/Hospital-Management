package servlet;

import java.io.IOException;      

//import java.util.ArrayList;

import conn.jdbcConnect;
import dao.DoctorDAO;
import entity.Doctor;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//@WebServlet("/registerPatient")
public class registerDoctor extends HttpServlet {
	boolean f=false;



	private static final long serialVersionUID = 1L;


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email").toLowerCase();
		String number=req.getParameter("number");
		String specialisation=req.getParameter("specialisation");
		String password=req.getParameter("password");
		


		
		Doctor doctor = new Doctor(name,email,number,specialisation,password);
//		HttpSession session=req.getSession();


//		jdbcConnect c =new jdbcConnect();



		try {
			DoctorDAO dao = new DoctorDAO(jdbcConnect.getConn());

			f= dao.addDoctor(doctor);
			System.out.println("allCheck2");

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



//		session.setAttribute("succMsg", "Student Details submit Successfully..");
//		resp.sendRedirect("index.jsp");
//		System.out.println("Student Details submit Successfully..");


	}

}
