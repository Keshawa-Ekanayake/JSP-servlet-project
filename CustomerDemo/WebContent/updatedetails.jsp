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
	<%
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		String email = request.getParameter("email");
		String number = request.getParameter("number");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	%>
	
	<form action="update" method="post">
		Customer ID <input class="form-control" type="text" name="cid" value = "<%=cid%>" readonly><br><br>
		Name <input class="form-control" type="text" name="cname" value = "<%=cname%>"><br><br>
		Email <input class="form-control" type="text" name="email" value = "<%=email%>"><br><br>
		Phone Number <input class="form-control" type="text" name="number" value = "<%=number%>"><br><br>
		User Name <input class="form-control" type="text" name="username" value = "<%=username%>"><br><br>
		Password <input class="form-control" type="password" name="password" value = "<%=password%>"><br><br>
		
		<input class="btn btn-primary" type="submit" name="submit" value="Update Customer Details"><br>
	</form>
	
	</div>
</body>
</html>