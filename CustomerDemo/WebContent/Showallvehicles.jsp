<!-- IT19150758 -->
<!-- EKANAYAKE K.L.W -->


<%@page import="com.customer.Vehicle"%>
<%@page import="java.util.Iterator"%>
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
<div class ="container">
	<table class="table table-dark">
		
		
		<tr>
		<th>Vehicle ID</th>
		<th>Seller name</th>
		<th>Seller Address</th>
		<th>Seller Price</th>
		<th>Seller Phone Number</th>
		<th>Seller Email Address</th>
		<th>Vehicle Model</th>
		<th>Vehicle Year</th>
		<th>Vehicle ChassisID</th>
		<th>Vehicle Milage</th>
		</tr>
		
<%

	ArrayList<Vehicle> vdetails =(ArrayList) request.getAttribute("allvehicledetails");
	Iterator it = vdetails.iterator();

	while(it.hasNext()){
		
		Vehicle vehicledetails = (Vehicle)it.next();

	%>

	
		
		<tr>
		<td><%=vehicledetails.getId()%></td>
		<td><%=vehicledetails.getVname()%></td>
		<td><%=vehicledetails.getVaddress()%></td>
		<td><%=vehicledetails.getVprice()%></td>
		<td><%=vehicledetails.getvPhoneNumber()%></td>
		<td><%=vehicledetails.getvEmailAddress()%></td>
		<td><%=vehicledetails.getvModel()%></td>
		<td><%=vehicledetails.getvYear()%></td>
		<td><%=vehicledetails.getvChassisID()%></td>
		<td><%=vehicledetails.getvMilage()%></td>
		
		</tr>


	<%
	}
	%>

	</table>
	</div>	
		</div>

</body>
</html>