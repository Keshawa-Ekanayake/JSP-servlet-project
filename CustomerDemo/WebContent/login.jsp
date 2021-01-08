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
		<form action="log" method="post">
		User Name <input class="form-control"  type="text" name="uid"> <br><br>
		Password <input class="form-control" type="password" name="pass"><br><br>
		
		<input class="btn btn-primary" type="submit" name="submit" value="Login Now">
		
		<a href = "Customerinsert.jsp">
			<input class="btn btn-success" type ="button" name ="update" value="Register Now">
		</a><br><br>
	</form>
		</div>
</body>
</html>