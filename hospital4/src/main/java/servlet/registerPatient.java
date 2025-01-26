package servlet;

import java.io.IOException;      

//import java.util.ArrayList;

import conn.jdbcConnect;
import dao.PatientDAO;
import entity.Patient;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//@WebServlet("/registerPatient")
public class registerPatient extends HttpServlet {
	boolean f=false;



	private static final long serialVersionUID = 1L;


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String docName=req.getParameter("docName");
		String email=req.getParameter("email");
		String date=req.getParameter("date");


		Patient patient =new Patient(name,age,docName,email,date);

//		HttpSession session=req.getSession();


//		jdbcConnect c =new jdbcConnect();



		try {
			PatientDAO dao = new PatientDAO(jdbcConnect.getConn());

			f= dao.addPatient(patient);
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
