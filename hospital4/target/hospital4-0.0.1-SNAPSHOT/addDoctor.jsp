<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
<link href="style.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Add Doctor</title>
</head>
<body>

<%@ include file="navbar.jsp"%>

<div class="form-style-5">
<form action="registerDoctor" method="post">
<fieldset>
<legend>Add A Doctor</legend>
<input type="text" name="name" placeholder="Doctor's Name *">
<input type="email" name="email" placeholder="Doctor's Email *">
<input type="number" name="number" placeholder="Doctor's Number *">
<input type="text" name="specialisation" placeholder="Specialisation *">
<input type="text" name="password" placeholder="Password *">


      
</fieldset>

<input type="submit" value="Submit"/>
</form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>