<!-- IT19150758 -->
<!-- EKANAYAKE K.L.W -->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Selling Vehicle</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
</head>
<body>


	<div class="container bg-secondary">
	<h1> Enter Your Vehicle Details </h1>
	<form action = "VehicledataInsertservlet" method = "post">
		
		Enter Your UserName 	: <input class="form-control" type = "text" name = "uname"><br><br>
		Enter Your Name 		: <input class="form-control" type = "text" name = "name"><br><br>
		Enter Address 			: <input class="form-control" type = "text" name = "location"><br><br>
		Enter Your Price 		: <input class="form-control" type = "text" name = "price"><br><br>
		Enter Your Phone Number : <input class="form-control" type = "text" name = "pnumber"><br><br>
		Enter Your Email Address: <input class="form-control" type = "text" name = "eaddress"><br><br>
		Enter Vehicle Model 	: <input class="form-control" type = "text" name = "model"><br><br>
		Enter Vehicle Year 		: <input class="form-control" type = "text" name = "year"><br><br>
		Enter Vehicle Chassis ID: <input class="form-control" type = "text" name = "cid"><br><br>
		Enter Vehicle Milage 	: <input class="form-control" type = "text" name = "milage"><br><br>
		
	    <input class="btn btn-success" type = "submit" name = "submit" value = "Enter Your Details">
	
	
	</form>
	<br>
	</div>
</body>
</html>