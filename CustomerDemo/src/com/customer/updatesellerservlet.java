
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


@WebServlet("/updatesellerservlet")
public class updatesellerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("sellerid");//methods to catch the variables in BankDetailsForm
		String name = request.getParameter("name");
		String Address = request.getParameter("Address");
		String Price = request.getParameter("Price");
		String Phone = request.getParameter("Phone");
		String Email = request.getParameter("Email");
		String Model = request.getParameter("Model");
		String Year = request.getParameter("Year");
		String ChassisID = request.getParameter("ChassisID");
		String Milage = request.getParameter("Milage");
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.updatesellerdetails(id, name, Address, Price, Phone, Email, Model, Year, ChassisID, Milage);
		
		if(isTrue == true) {
			
			List<Vehicle> vehicledetails = CustomerDBUtil.getVehicleDetails(id);
			request.setAttribute("vehicledetails", vehicledetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("vehicledetails.jsp");
			dis.forward(request, response);
		}
		
		else {
			RequestDispatcher dis = request.getRequestDispatcher("Notupdated.jsp");
			dis.forward(request, response);
		}
	}

}
