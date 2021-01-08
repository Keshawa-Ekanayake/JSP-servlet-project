<!-- IT19151366 -->
<!-- JAYARATHNA I.T -->


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
	<form action="BankDetailsservlet" method = "post">
	
	<p><b> If you already have an account enter your account number and bank name.</b></p> <br>
		Account Number : <input type = "text" class="form-control" name = "no"> <br>
		Bank Name : <input type = "text" class="form-control" name = "name"> <br>
		
		<input type ="submit"class="btn btn-success" name = "submit" value = "Done"><br><br>
		
	</form>
	<form action="Formservlet" method = "post">
	
	<P><b> If you don't enter the Bank Details, Fill this Form </b></P><br>
		<input type = "submit" class="btn btn-primary" name = "submit" value = "Form">
		
	</form>
	</div>
</body>
</html>