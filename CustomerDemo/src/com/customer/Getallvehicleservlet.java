
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


@WebServlet("/Getallvehicleservlet")
public class Getallvehicleservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			List<Vehicle> vehicledetails = CustomerDBUtil.getallVehicleDetails();
			request.setAttribute("allvehicledetails",vehicledetails );
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			
			RequestDispatcher dis3 = request.getRequestDispatcher("Showallvehicles.jsp");
			dis3.forward(request, response);
			
		}

		
		
		
		
		
		
	}


