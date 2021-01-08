<!-- IT19151366 -->
<!-- JAYARATHNA I.T -->


<%@page import="java.util.Iterator"%>
<%@page import="com.customer.BankDetails"%>
<%@page import="java.util.ArrayList"%>
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
	

	ArrayList<BankDetails> bdetails =(ArrayList) request.getAttribute("GetBankDetails");
	Iterator it = bdetails.iterator();

	while(it.hasNext()){
		
	BankDetails badetails = (BankDetails)it.next();

	%>

	<h1>update your bank details</h1>
	<form action="Updatedb2" method = "post">
		<input type = "hidden" name = "id" value = "<%=badetails.getBDid()%>"/>
		Bank Id: <label  class="form-control" name = "bid" value = "<%=badetails.getBDid()%>" ><%=badetails.getBDid()%></label><br>
		Customer Id: <input  class="form-control" type = "text" name = "cid" value = "<%=badetails.getCid()%>" disabled ><br>
		Account NO: <input  class="form-control" type = "text" name = "no" value = "<%=badetails.getAccnountNo()%>"><br>
		Bank Name: <input  class="form-control" type = "text" name = "name" value = "<%=badetails.getBankname() %>"><br>
		Account Holder Name: <input  class="form-control" type = "text" name = "hname" value = "<%=badetails.getAccountholder() %>"><br>
		
		<input class="btn btn-primary" type = "submit" name = "submit" value = "update"><br>
	
	</form>
	<%
}
%>
</div>
</body>
</html>