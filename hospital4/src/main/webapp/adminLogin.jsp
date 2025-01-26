<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
<link href="style2.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta charset="UTF-8">
<title>adminLogin</title>
</head>
<body>
<ab>
<%@ include file="navbar.jsp"%>

 <div class="main">
       
        <h3>Enter Admin's Credentials</h3>

        <form action="adminTabServlet" method="post" >
            <label for="Email">
                Email:
            </label>
            <input type="email" id="first" name="email" 
                placeholder="Enter your Email" required>

            <label for="password">
                Password:
            </label>
            <input type="password" id="password" name="password" 
                placeholder="Enter your Password" required>

            <div class="wrap">
                <button type="submit">
                    Submit
                </button>
            </div>
        </form>
        
        
    </div>
    </ab>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>