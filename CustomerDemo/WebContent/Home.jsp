<!--IT19150826-->
<!--D.P KAVINDI GIMSHANI-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
</head>
<body>
		
		<div class="container bg-secondary">
		
		<button class="btn btn-primary"  onclick = "document.location = 'sellingvehicleinsert.jsp'">
		 Sell your vehicle 
		</button>
		
		<br>	<br>	
		<button class="btn btn-primary" onclick = "document.location = 'searchvehicle.jsp'">
		search
		</button><br>
		
		<br>
		
		<form action="Getallvehicleservlet" method="post">
		<button class="btn btn-primary">Show Vehicles</button>
		</form>
		
		</div>
		
		
</body>
</html>