<!-- IT19150826 -->
<!-- D.P KAVINDI GIMSHANI -->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>thilakshi</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
</head>
<body>
		
	<div class="container bg-secondary">
	<h1>You have entered your bidding value.</h1>
	
	
	
	<form action="Showbidvalueservlet" method = "post">
		
		Enter Your UserName  :<input type = "text" class="form-control" name = "username">
		Enter  Vehicle ID:<input type = "text" class="form-control" name = "vid">
		
		<input type = "submit" class="btn btn-success" name = "submit" value = "Check My Bid value">
	</form>
	
	<table class="table-responsive">
	<c:forEach var = "bid" items = "${bidvalue}">
	
	
	<c:set var = "id" value = "${bid.id}"/>
	<c:set var = "value" value = "${bid.value}"/>
	<c:set var = "vname" value = "${bid.vname}"/>
	<c:set var = "cid" value = "${bid.cid}"/>
	<c:set var = "vehicleid" value = "${bid.vehicleid}"/>	
	
	
	
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
	
	
	
	
<c:url value = "updatebidder.jsp" var = "updatebidder">

	<c:param name="id" value = "${id}"/>
	<c:param name="value" value = "${value}"/>
	<c:param name="vname" value = "${vname}"/>
	<c:param name="cid" value = "${cid}"/>
	<c:param name="vehicleid" value = "${vehicleid}"/>
	
</c:url>

<a href = "${updatebidder}">
	<input type = "button" class="btn btn-primary" name = "update" value = "Update Bid Value">
</a>
	


<c:url value = "deletebidder.jsp" var = "deletebidder">

	<c:param name="id" value = "${id}"/>
	<c:param name="value" value = "${value}"/>
	<c:param name="vname" value = "${vname}"/>
	<c:param name="cid" value = "${cid}"/>
	<c:param name="vehicleid" value = "${vehicleid}"/>
	
</c:url>	

<a href = "${deletebidder}">

	<input type = "button" class="btn btn-danger" name = "delete" value = "Delete my bidding details"><br>
	
</a>
	
	
	
	<form action = "BankDetails.jsp" method = "post">
	
	
	<button class="btn btn-primary"> Payment </button>
	
	
	</form>
	
	
	
	</div>
	
</body>
</html>

