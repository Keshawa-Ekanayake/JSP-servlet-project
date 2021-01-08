 <!-- IT19148496 -->
 <!-- ANANDA K.G.R.I.-->

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
	<form action="insert" method="post">
		Name <input type="text" class="form-control" name="name"><br><br>
		Email <input type="text" class="form-control" name="email"><br><br>
		Phone Number <input type="text" class="form-control" name="phone"><br><br>
		User Name <input type="text" class="form-control" name="uid"><br><br>
		Password <input type="password"class="form-control" name="psw"><br><br>
		
		<input class="btn btn-primary" type="submit" name="submit" value="Register">
	</form>
	</div>
</body>
</html>