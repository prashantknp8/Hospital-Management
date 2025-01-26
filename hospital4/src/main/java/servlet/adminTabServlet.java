package servlet;

import java.io.IOException;      


//import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class adminTabServlet extends HttpServlet {
	boolean f=false;



	private static final long serialVersionUID = 1L;


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email").toLowerCase();
		String password=req.getParameter("password");

			
		 if(email.equals("prashant074@gmail.com") && password.equals("prashant074")){  
		        RequestDispatcher rd=req.getRequestDispatcher("/adminTab.jsp");  
		        rd.forward(req, resp);  
		    }  
		    else{  
		        System.out.print("Sorry Email or Password Error!");  
		        RequestDispatcher rd=req.getRequestDispatcher("/adminLogin.jsp");  
		        rd.include(req, resp);  
		                      
		        }  
		

	}

}
