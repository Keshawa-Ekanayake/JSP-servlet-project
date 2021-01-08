<!-- IT19150758 -->
<!-- EKANAYAKE K.L.W -->



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Vehicle</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
</head>
<body>
<div class="container bg-secondary">
<h1> Search Vehicles</h1>
	<form action="displayvehicleservlet" method = "post">
	
		Enter Vehicle Model :<input type = "text" class="form-control" name = "model"><br><br>
		Enter Vehicle Year  :<input type = "text" class="form-control" name = "year"><br><br>
		
		<input class="btn btn-primary" type = "submit" name = "search" value = "Search">
	
	
	</form>
	<br>
	</div>
</body>
</html>