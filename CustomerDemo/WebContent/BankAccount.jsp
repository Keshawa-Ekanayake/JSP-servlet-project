
<!-- IT19151366 -->
<!-- JAYARATHNA I.T -->

<%@page import="java.util.Iterator"%>
<%@page import="com.customer.BankDetails"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script> 
</head>
<body>

<div class="container bg-secondary">
<%

	ArrayList<BankDetails> bdetails =(ArrayList) request.getAttribute("BankDetails");
	Iterator it = bdetails.iterator();

	while(it.hasNext()){
		
		BankDetails badetails = (BankDetails)it.next();

	%>

	<div class ="container">
	<table class="table table-hover">
		
		<tr>
		<th>bank id</th>
		<th>customer id</th>
		<th>Account Number</th>
		<th>Bank name</th>
		<th>Holder</th>
		</tr>
		
		
		<tr>
		<td><%=badetails.getBDid()%></td>
		<td><%=badetails.getCid()%></td>
		<td><%=badetails.getAccnountNo()%></td>
		<td><%=badetails.getBankname()%></td>
		<td><%=badetails.getAccountholder()%></td>
		<td><form action="UpdateDBservlet" method="post">
		<input type="hidden" name="bankacid" value="<%=badetails.getBDid()%>">
		<input type="submit" value="Update" class="btn btn-success"></form></td>
		<td><form action="Deleteservlet" method="post">
		<input type="hidden" name="deleteid" value="<%=badetails.getBDid()%>">
		<input type="submit" value = "delete" class="btn btn-danger"></form></td>
			

		</tr>


	<%
	}
	%>

	</table>
	</div>	
		</div>
	</body>
	</html>