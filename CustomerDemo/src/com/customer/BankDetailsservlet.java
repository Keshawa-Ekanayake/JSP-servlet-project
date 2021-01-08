//IT19151366
//JAYARATHNA I.T

package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BankDetailsservlet")
public class BankDetailsservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String accountNo = request.getParameter("no");//get paramters from jsp file
		String bankname = request.getParameter("name");
		
		
		try {
		
		List<BankDetails> BankDetails = CustomerDBUtil.validate1(accountNo, bankname);//save the values for BankDetails from the validate1 method.
		
		request.setAttribute("BankDetails", BankDetails);
		RequestDispatcher dis2 = request.getRequestDispatcher("/BankAccount.jsp");//calling jsp file.
		dis2.forward(request, response);
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
