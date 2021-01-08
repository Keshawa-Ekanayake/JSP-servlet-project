
//IT19150758 
//EKANAYAKE K.L.W 

package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Deletesellerdetailsservlet")
public class Deletesellerdetailsservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("sellerid");//get values from the form and saves in variables.
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.deletesellerdetails(id);//the return value deletesellerdetails method saves in isTrue variable.
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("sellingvehicleinsert.jsp");
			dis.forward(request, response);
		}
		
		else {
			
			List<Vehicle> vehicledetails = CustomerDBUtil.getVehicleDetails(id);
			request.setAttribute("vehicledetails", vehicledetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("vehicledetails.jsp");
			dis.forward(request, response);
		}
		
	}

}
