
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
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container bg-secondary">
	<form action ="InsertBankDetails" method = "post">
		Account Number : <input type = "text" class="form-control" name= "number"><br>
		Bank Name : <input type = "text" class="form-control" name = "name"><br>
		Account Holder Name : <input type = "text" class="form-control" name = "hname">
		<br>
		<input   type = "submit" class="btn btn-success" name = "submit" value ="submit">
	
	</form>
	</div>
	
</body>
</html>