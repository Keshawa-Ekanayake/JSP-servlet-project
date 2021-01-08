
<!-- IT19150826 -->
<!-- D.P KAVINDI GIMSHANI -->


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
		
		String id = request.getParameter("id");
		String value = request.getParameter("value");
        String vname = request.getParameter("vname");
        String cid = request.getParameter("cid");
        String vehicleid = request.getParameter("vehicleid");
        		
      %>
      
      <h1> Bidder Details Delete</h1>
      
      <form action="Deletebidderservlet"  method = "post">
      
      	The Bid ID  <input class="form-control" type = "text" name = "bid" value = "<%= id %>"readonly><br>
		The Bidding Value<input class="form-control" type = "text" name = "bidbalue" value = "<%= value %>"><br>
		The Username <input class="form-control" type = "text" name = "username" value = "<%= vname %>"><br>
		The Customer Id <input class="form-control" type = "text" name = "cid" value = "<%= cid %>"><br>
		The Vehicle ID <input class="form-control" type = "text" name = "vid" value = "<%= vehicleid %>"><br>
		
		
		<input class="btn btn-danger" type = "submit" name = "delete" value = "Delete my bidding details">
      
      </form>
	</div>
</body>
</html>