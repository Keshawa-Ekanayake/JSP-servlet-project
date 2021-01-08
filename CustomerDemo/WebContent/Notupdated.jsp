
<!-- IT19150826 -->
<!-- D.P KAVINDI GIMSHANI -->

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
<table class="table table-dark">
	<c:forEach var = "bid" items = "${bidvalue}">
	<tr>
				<td>Bid ID</td>
				<td>${bid.id}</td>
			</tr>
			
			<tr>	
				<td>Bid Value</td>
				<td>${bid.value}</td>
			</tr>
				
			<tr>
				<td>Bid User Name</td>
				<td>${bid.vname}</td>
			</tr>
				
			<tr>
				<td>Customer ID</td>
				<td>${bid.cid}</td>
			</tr>
			
			<tr>
				<td>The VehicleID</td>	
				<td>${bid.vehicleid}</td>
			</tr>
			
	</c:forEach>
	
	</table>
	</div>
</body>
</html>