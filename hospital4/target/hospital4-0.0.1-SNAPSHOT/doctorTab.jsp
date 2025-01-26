<%@ page import ="java.sql.Connection"%>
	<%@ page import ="conn.jdbcConnect"%>
	<%@ page import ="dao.PatientDAO"%>
	<%@ page import ="entity.Patient"%>
	<%@ page import ="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
<link href="style2.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta charset="UTF-8">
<title>doctorTab</title>
</head>
<body>

<%@ include file="navbar.jsp"%>
<%-- include file="navbar.jsp"--%>

<center>
<h2> Appointment Table </h2>
</center>
<table class="table2 table table-hover table-secondary">
  <thead>
    <tr>
      <th scope="col">Patient Id</th>
      <th scope="col">Patient Name</th>
      <th scope="col">Age</th>
      <th scope="col">Appointment Date</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
  <tbody>
  
  	<% 		String email = (String) request.getAttribute("email1");
			PatientDAO dao= new PatientDAO(jdbcConnect.getConn());
			List<Patient> list= dao.getAllPatientOfDoctor(email);
			int i=1;
			for(Patient patient: list){
			
			
			
			%>	
				<tr>
					<th scope="row"><%=i++%></th>
					<td><%=patient.getName()%></td>
					<td><%=patient.getAge()%></td>
					<td><%=patient.getDate()%></td>
					<td><%=patient.getEmail()%> </td>
					<td><% } %></td>
					 		</tr>
  
  
  
 
  </tbody>
</table>

 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>