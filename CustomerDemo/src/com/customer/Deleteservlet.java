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


@WebServlet("/Deleteservlet")
public class Deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String deleteid = request.getParameter("deleteid");//get parameter from jsp file.		
		try {
			
				boolean deletedt = CustomerDBUtil.deleteDB(Integer.parseInt(deleteid));//save the return values from the deleteDB method to deletedt
			
				request.setAttribute("GetdeleteDB", deletedt);
				RequestDispatcher dis2 = request.getRequestDispatcher("/BankDetails.jsp");//prompt to BankDetails.jsp page
				dis2.forward(request, response);
		
		}catch (Exception e) {
				e.printStackTrace();
			}
		
		
	}

}
