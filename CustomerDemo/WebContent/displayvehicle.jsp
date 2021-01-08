<!--IT19150826-->
<!--D.P KAVINDI GIMSHANI-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
</head>
<body>
<div class="container bg-secondary">
<form action="BidValueServlet" method = "post">

<table class="table table-dark" border = 1>
	
	<c:forEach var = "print" items = "${displayvehicle}">
	
	
	<tr>
	
		<th>Vehicle ID</th>
		<th>Seller name</th>
		<th>Seller Address</th>
		<th>Seller Price</th>
		<th>Seller Phone Number</th>
		<th>Seller Email Address</th>
		<th>Vehicle Model</th>
		<th>Vehicle Year</th>
		<th>Vehicle ChassisID</th>
		<th>Vehicle Milage</th>
		<th>Your-Bidding-value</th>
		<th>Vehicle ID </th>
		<th>Username</th>
		<th></th>
		
	</tr>
	
	<tr>
		
		<td>${print.id}</td>
		<td>${print.vname}</td>
		<td>${print.vaddress}</td>
		<td>${print.vprice}</td>
		<td>${print.vPhoneNumber}</td>
		<td>${print.vEmailAddress}</td>
		<td>${print.vModel}</td>
		<td>${print.vYear}</td>
		<td>${print.vChassisID}</td>
		<td>${print.vMilage}</td>
		<td style = "width:30%"> <input  class="form-control" type = "text" name = "value" > </td>
		<td> <input  class="form-control" type = "text" name = "id"> </td>
		<td> <input  class="form-control" type = "text" name = "user"> </td>
		<td> <input class="btn btn-success" type = "submit" value = "Enter Price"> </td>
		
		
		 				
	</tr>
	
	</c:forEach>
	
</table>	

</form>		
	</div>	
</body>
</html>