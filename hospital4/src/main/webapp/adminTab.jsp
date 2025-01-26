<%@ page import ="java.sql.Connection"%>
	<%@ page import ="conn.jdbcConnect"%>
	<%@ page import ="dao.PatientDAO"%>
	<%@ page import ="entity.Patient"%>
	<%@ page import ="dao.DoctorDAO"%>
	<%@ page import ="entity.Doctor"%>
	
	<%@ page import ="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head> 
<link href="style2.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta charset="UTF-8">
<title>adminTab</title>
</head>
<body>

<%@ include file="navbar.jsp"%>
<%-- include file="navbar.jsp"--%>



<%-- all appointment table start here --%>
<center>
<h2> All Appointments</h2>
</center>
<table class="table2 table table-hover table-secondary">
  <thead>
    <tr>
      <th scope="col">Patient Id</th>
      <th scope="col">Patient Name</th>
      <th scope="col">Doctor Name</th>
      <th scope="col">Appointment Date</th>
      <th scope="col">Email</th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
  
  
			<% 
			PatientDAO dao= new PatientDAO(jdbcConnect.getConn());
			List<Patient> list= dao.getAllPatient();
			int i=1;
			for(Patient patient: list){
			
			
			
			%>	
				<tr>
					<th scope="row"><%=i++%></th>
					<td><%=patient.getName()%></td>
					<td><%=patient.getDocName()%></td>
					<td><%=patient.getDate()%></td>
					<td><%=patient.getEmail()%> </td>
					<td><% } %></td>
					 		</tr>
  
  
  
  </tbody>
</table>

<%-- all doctor table start here --%>

<center>
<h2> All Doctors</h2>
</center>
<table class="table2 table table-hover table-secondary">
  <thead>
    <tr>
      <th scope="col">Doctor Id</th>
      <th scope="col">Doctor Name</th>
      <th scope="col">Doctor Email</th>
      <th scope="col">Phone Number</th>
      <th scope="col">Specialization</th>
      <th scope="col">Passwords</th>
    </tr>
  </thead>
  <tbody>
  
			<% 
			DoctorDAO dao2= new DoctorDAO(jdbcConnect.getConn());
			List<Doctor> list2= dao2.getAllDoctor();
			int j=1;
			for(Doctor doctor: list2){
			
			
			
			%>	
				<tr>
					<th scope="row"><%=j++%></th>
					<td><%=doctor.getName()%></td>
					<td><%=doctor.getEmail()%></td>
					<td><%=doctor.getNumber()%> </td>
					<td><%=doctor.getSpecialisation()%></td>
					<td><%=doctor.getPassword()%></td>
				
						<td><% } %></td>
					 		</tr>
       
      
    
  </tbody>
</table>

  <a href="addDoctor.jsp"> <button style="max-width:10%; font-size:15px; font-weight:bold; margin:10px 15%; color:black; "> ADD DOCTOR</button></a>
 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>