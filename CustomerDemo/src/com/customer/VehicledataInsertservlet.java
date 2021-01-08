
//IT19150758 
//EKANAYAKE K.L.W 

package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/VehicledataInsertservlet")
public class VehicledataInsertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Uname = request.getParameter("uname");//methods to catch the variables in BankDetailsForm
		String Name = request.getParameter("name");
		String Address = request.getParameter("location");
		String Price = request.getParameter("price");
		String PhoneNumber = request.getParameter("pnumber");
		String EmailAddress = request.getParameter("eaddress");
		String Model = request.getParameter("model");
		String Year = request.getParameter("year");
		String ChassisID = request.getParameter("cid");
		String Milage = request.getParameter("milage");
		
		boolean istrue;
		
		istrue = CustomerDBUtil.insertvehicles(Uname ,Name, Address, Price, PhoneNumber, EmailAddress, Model, Year, ChassisID, Milage);//the return value insertvehicles method saves in isTrue variable.
		
		if(istrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
