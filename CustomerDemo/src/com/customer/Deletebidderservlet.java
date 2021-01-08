
//IT19150826
//D.P KAVINDI GIMSHANI

package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Deletebidderservlet")
public class Deletebidderservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("bid");//get values from the form and saves in variables.
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.deletebidderdetails(id);//the return value deletebidderdetails method saves in isTrue variable.
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("Bank.jsp");
			dis.forward(request, response);
		}
		
		else {
			
			List<Bidvalue> bidvalue = CustomerDBUtil.getbiddingdetails(id);
			request.setAttribute("bidvalue", bidvalue);
			
			RequestDispatcher dis = request.getRequestDispatcher("displayvehicle.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
