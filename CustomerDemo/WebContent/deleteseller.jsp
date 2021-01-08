<!-- IT19150758 -->
<!-- EKANAYAKE K.L.W -->


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
	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String Address = request.getParameter("Address");
		String Price = request.getParameter("Price");
		String PhoneNumber = request.getParameter("PhoneNumber");
		String EmailAddress = request.getParameter("EmailAddress");
		String VehicleModel = request.getParameter("VehicleModel");
		String VehicleYear = request.getParameter("VehicleYear");
		String VehicleChassisID = request.getParameter("VehicleChassisID");
		String VehicleMilage = request.getParameter("VehicleMilage");
	%>
	
	<h1> Seller Details Delete</h1>
	
	<form action = "Deletesellerdetailsservlet" method = "post">
	Vehicle ID<input class="form-control" type = "text" name = "sellerid" value = "<%= id %>" readonly><br>
	Seller name<input class="form-control" type = "text" name = "name" value = "<%= name %>"readonly><br>
	Seller Address<input class="form-control" type = "text" name = "Address" value = "<%= Address %>"readonly><br>
	Seller Price<input class="form-control" type = "text" name = "Price" value = "<%= Price %>"readonly><br>
	Seller Phone Number<input class="form-control" type = "text" name = "Phone" value = "<%= PhoneNumber %>"readonly><br>
	Seller Email Address<input class="form-control" type = "text" name = "Email" value = "<%= EmailAddress %>"readonly><br>
	Seller Vehicle Model<input class="form-control" type = "text" name = "Model" value = "<%= VehicleModel %>"readonly><br>
	Seller Vehicle Year<input class="form-control" type = "text" name = "Year" value = "<%= VehicleYear %>"readonly><br>
	Seller Vehicle ChassisID<input class="form-control" type = "text" name = "ChassisID" value = "<%= VehicleChassisID %>"readonly><br>
	Seller Vehicle Milage<input class="form-control" type = "text" name = "Milage" value = "<%= VehicleMilage %>"readonly><br>
	
	
	<input class="btn btn-danger" type = "submit" name = "submit" value = "Delete My seller details"> <br>
	
	
	</form>
	</div>
</body>
</html>