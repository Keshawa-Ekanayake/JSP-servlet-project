
//IT19148496
//ANANDA K.G.R.I.


package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deletecusservlet")
public class deletecusservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String cid = request.getParameter("cid");//get values from the form and saves in variables.
		
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.deleteCus(cid);//the return value deleteCus method saves in isTrue variable.
		
		if (isTrue==true) {	
			RequestDispatcher dis = request.getRequestDispatcher("Customerinsert.jsp");//prompt Customerinsert.jsp page.
			dis.forward(request, response);
		}
		else {
			List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(cid);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
