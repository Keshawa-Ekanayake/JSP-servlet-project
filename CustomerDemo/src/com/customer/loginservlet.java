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


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("uid");//methods to catch the variables in BankDetailsForm
	    String password = request.getParameter("pass");
	    
	    try {
        	  List<Customer> cusDetails = CustomerDBUtil.validate(username, password);
        	  request.setAttribute("cusDetails", cusDetails);
	    }
	    catch (Exception e) {
		e.printStackTrace();
	    }
	    
	    
	    RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
	    dis.forward(request, response); 
		
		
	}

}
