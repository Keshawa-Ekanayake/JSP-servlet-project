
//IT19148496
//ANANDA K.G.R.I.


package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Customerinsert")
public class Customerinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cname = request.getParameter("name");//get the values from the form and save in variables.
		String email = request.getParameter("email");
		String number = request.getParameter("phone");
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");
		
		boolean istrue;
		
		istrue = CustomerDBUtil.insertcustomer(cname, email, number, username, password);//the return value is saves in isTrue variable.
		
		if(istrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("login.jsp");//prompt login.jsp page.
			dis.forward(request, response);	
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");//prompt unsuccess.jsp page.
			dis2.forward(request, response);
		}
		
	}

}
