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


@WebServlet("/Updatedb2")
public class Updatedb2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");//methods to catch the variables in BankDetailsForm
		int updateid = Integer.parseInt(id);
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String hname = request.getParameter("hname");
		
		System.out.println("value passed");
		try {
			
			System.out.println(updateid);
			boolean updatedt = CustomerDBUtil.updateDB(updateid , no , name , hname);
			
			request.setAttribute("GetupdateDB", updatedt);
			RequestDispatcher dis2 = request.getRequestDispatcher("/BankDetailsservlet");
			dis2.forward(request, response);
		
			}catch (Exception e) {
				e.printStackTrace();
		
	}

}
	}
