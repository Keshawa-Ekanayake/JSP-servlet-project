<!-- IT19148496 -->
<!-- ANANDA K.G.R.I.-->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
</head>
<body>
	
	<div class="container bg-secondary">
	<table class="table table-dark" border="1" Width ="50%" >
	<c:forEach var="cus" items="${cusDetails}">
	
	<c:set var="cid" value ="${cus.cid}"/>
	<c:set var="cname" value ="${cus.cname}"/>
	<c:set var="email" value ="${cus.email}"/>
	<c:set var="number" value ="${cus.number}"/>
	<c:set var="username" value ="${cus.username}"/>
	<c:set var="password" value ="${cus.password}"/>
	
	
	<tr>
		<td>Customer ID -</td>
		<td>${cus.cid}</td>
	</tr>
	<tr>
		<td>Customer Name -</td>
		<td>${cus.cname}</td>
	</tr>
	<tr>
		<td>Customer Email -</td>
		<td>${cus.email}</td>
	</tr>
	<tr>
		<td>Customer Phone -</td>
		<td>${cus.number}</td>
	</tr>
	<tr>
		<td>Customer User Name -</td>
		<td>${cus.username}</td>
	</tr>
	<tr>
		<td>Customer Password -</td>
		<td>${cus.password}</td>
	</tr>
	
	</c:forEach>
	</table><br><br>
	
	<c:url value="updatedetails.jsp" var="updatecus">
	
		<c:param name="cid" value="${cid}"/>
		<c:param name="cname" value="${cname}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="number" value="${number}"/>
		<c:param name="username" value="${username}"/>
		<c:param name="password" value="${password}"/>
		
	</c:url>
	<a href = "${updatecus}">
	<input class="btn btn-primary" type ="button" name ="update" value="Update User Data">
	</a>
	
	
	<c:url value="deletecus.jsp" var="deletecus">
	
		<c:param name="cid" value="${cid}"/>
		<c:param name="cname" value="${cname}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="number" value="${number}"/>
		<c:param name="username" value="${username}"/>
		<c:param name="password" value="${password}"/>
		
	</c:url>
	<a href = "${deletecus}">
	<input class="btn btn-danger" type ="button" name ="delete" value="Delete My Account">
	</a>
	
	</div>
</body>
</html>