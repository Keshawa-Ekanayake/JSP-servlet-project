<!-- IT19150758 -->
<!-- EKANAYAKE K.L.W -->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VEHICLESHOW</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
</head>
<body>

<div class="container bg-secondary">
	<div class="container bg-secondary">
	<form action="Vehiclevalidateservlet" method = "post">
	
	Enter your name 				= <input class="form-control"  type = "text" name = "sellername">
	Enter your Email address        = <input class="form-control" type = "text" name = "email">
	
	<input class="btn btn-primary" type = "submit" name = "Showmydetails" value = "Show My Details">
	</form>
		<br>
	</div>
	<br>	<br>
	</div>
	
</body>
</html>