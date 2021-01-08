//IT19151366
//JAYARATHNA I.T

package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertBankDetails")
public class InsertBankDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
				String accnountNo = request.getParameter("number");//methods to catch the variables in BankDetailsForm
				String bankname = request.getParameter("name");
				String accountholder = request.getParameter("hname");
				
				boolean True;
				
				True = CustomerDBUtil.InsertBankDetails(accnountNo, bankname, accountholder);
				
				if(True == true) {
					RequestDispatcher dis = request.getRequestDispatcher("Home.jsp");//prompt to sellingvehicleinsert.jsp
					dis.forward(request, response);
				}
				else {
					RequestDispatcher dis1 = request.getRequestDispatcher("Unsuccess.jsp");
					dis1.forward(request, response);
				}
		
		
	}

}
