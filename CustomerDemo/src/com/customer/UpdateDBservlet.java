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


@WebServlet("/UpdateDBservlet")
public class UpdateDBservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String bankacid = request.getParameter("bankacid");//get values
		
		System.out.println("value passed");
		try {
			
			List<BankDetails> BankDetails = CustomerDBUtil.getdetails(bankacid);
			
			request.setAttribute("GetBankDetails", BankDetails);
			RequestDispatcher dis2 = request.getRequestDispatcher("/UpdateBD.jsp");//prompt to UpdateDB.jsp page
			dis2.forward(request, response);
		
			}catch (Exception e) {
				e.printStackTrace();
		
	}

}
}
