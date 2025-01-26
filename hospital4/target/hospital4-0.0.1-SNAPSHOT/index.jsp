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
<link href="style.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<%@ include file="navbar.jsp"%>

<div class="form-style-5">
<form action="registerPatient" method="post">
<fieldset>
<legend>TAKE AN APPOINTMENT</legend>
<input type="text" name="name" placeholder="Your Name *">
<input type="number" name="age" placeholder="Your Age *">
<select name="docName">
		<% 
			DoctorDAO dao2= new DoctorDAO(jdbcConnect.getConn());
			List<Doctor> list2= dao2.getAllDoctor();
			int j=1;
			for(Doctor doctor: list2){
				
			%>

    <option value="<%=j++%>" placeholder="Doctors"><%=doctor.getName()%></option>
    <% } %>
   
  </select> 
   
<input type="email" name="email" placeholder="Your Email *">
<input type="text" name="date"  placeholder="YYYY-MM-DD *">

      
</fieldset>

<input type="submit" value="Submit"/>
</form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>