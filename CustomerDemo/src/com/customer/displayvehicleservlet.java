
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


@WebServlet("/displayvehicleservlet")
public class displayvehicleservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String model = request.getParameter("model");//get values from the form and saves in variables.
			String year  = request.getParameter("year");
			
		
		try {
			
			List<Vehicle> displayvehicle = CustomerDBUtil.displayvehicle(model,year);//save the values to displayvehicle object.
			request.setAttribute("displayvehicle",displayvehicle );
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			
			RequestDispatcher dis4 = request.getRequestDispatcher("displayvehicle.jsp");
			dis4.forward(request, response);
			
		}
	}


