<!-- IT19150758 -->
<!-- EKANAYAKE K.L.W -->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Vehicle Details</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
</head>
<body>
<div class="container bg-secondary">
	<H1> THIS IS YOUR VEHICLE </H1>
	
	<table class="table table-dark">	
<c:forEach var = "vehicle" items = "${vehicledetails}"> 

<c:set var = "id" value = "${vehicle.id}"/>
<c:set var = "name" value = "${vehicle.vname}"/>
<c:set var = "Address" value = "${vehicle.vaddress}"/>
<c:set var = "Price" value = "${vehicle.vprice}"/>
<c:set var = "PhoneNumber" value = "${vehicle.vPhoneNumber}"/>
<c:set var = "EmailAddress" value = "${vehicle.vEmailAddress}"/>
<c:set var = "VehicleModel" value = "${vehicle.vModel}"/>
<c:set var = "VehicleYear" value = "${vehicle.vYear}"/>
<c:set var = "VehicleChassisID" value = "${vehicle.vChassisID}"/>
<c:set var = "VehicleMilage" value = "${vehicle.vMilage}"/>


	
	<tr>
		<td> Vehicle ID</td>
		<td>${vehicle.id}</td>
	</tr>
	
	<tr>
		<td>Seller name</td>	
		<td>${vehicle.vname}</td>
	</tr>
	

	<tr>
		<td>Seller Address</td>
		<td>${vehicle.vaddress}</td>
	</tr>
	
	<tr>
		<td>Seller Price </td>
		<td>${vehicle.vprice}</td>
	</tr>
	
	<tr>
		<td>Seller Phone Number</td>
		<td>${vehicle.vPhoneNumber}</td>
	</tr>
	
	<tr>
		<td>Seller Email Address</td>
		<td>${vehicle.vEmailAddress}</td>
	</tr>
	
	<tr>
		<td>Vehicle Model</td>
		<td>${vehicle.vModel}</td>
	</tr>
	
	<tr>
		<td>Vehicle Year</td>
		<td>${vehicle.vYear}</td>
	</tr>
	
		<tr>
		<td>Vehicle ChassisID</td>
		<td>${vehicle.vChassisID}</td>
	</tr>
	
		<tr>
		<td>Vehicle Milage</td>
		<td>${vehicle.vMilage}</td>
	</tr>
	
	
	
</c:forEach>
</table>

<c:url value = "updateseller.jsp" var = "sellerupdate">

	<c:param name="id" value = "${id}"/>
	<c:param name="name" value = "${name}"/>
	<c:param name="Address" value = "${Address}"/>
	<c:param name="Price" value = "${Price}"/>
	<c:param name="PhoneNumber" value = "${PhoneNumber}"/>
	<c:param name="EmailAddress" value = "${EmailAddress}"/>
	<c:param name="VehicleModel" value = "${VehicleModel}"/>
	<c:param name="VehicleYear" value = "${VehicleYear}"/>
	<c:param name="VehicleChassisID" value = "${VehicleChassisID}"/>
	<c:param name="VehicleMilage" value = "${VehicleMilage}"/>
		 
</c:url>

<a href = "${sellerupdate}">
	<input class="btn btn-primary" type = "button" name = "update" value = "Update My Data">
</a>


<c:url value = "deleteseller.jsp" var = "deleteseller">

	<c:param name="id" value = "${id}"/>
	<c:param name="name" value = "${name}"/>
	<c:param name="Address" value = "${Address}"/>
	<c:param name="Price" value = "${Price}"/>
	<c:param name="PhoneNumber" value = "${PhoneNumber}"/>
	<c:param name="EmailAddress" value = "${EmailAddress}"/>
	<c:param name="VehicleModel" value = "${VehicleModel}"/>
	<c:param name="VehicleYear" value = "${VehicleYear}"/>
	<c:param name="VehicleChassisID" value = "${VehicleChassisID}"/>
	<c:param name="VehicleMilage" value = "${VehicleMilage}"/>
	
</c:url>

	
<a href = "${deleteseller}">
<input class="btn btn-danger"type = "button" name = "delete" value = "Delete my selling details"><br>
</a>
</div>
</body>
</html>