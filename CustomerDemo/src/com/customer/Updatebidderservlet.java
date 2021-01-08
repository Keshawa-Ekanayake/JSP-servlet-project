
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


@WebServlet("/Updatebidderservlet")
public class Updatebidderservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Updatebidderservlet() {
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bid = request.getParameter("bid");//methods to catch the variables in BankDetailsForm
		String value = request.getParameter("bidbalue");
		String username = request.getParameter("username");
		String cusid = request.getParameter("cid");
		String vid = request.getParameter("vid");

		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.updatebidder(bid, value, username, cusid, vid);
		
		if(isTrue == true) {
			
			List<Bidvalue> bidvalue = CustomerDBUtil.getbiddingdetails(bid);
			request.setAttribute("bidvalue", bidvalue);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("Bank.jsp");//prompt to Bank.jsp file.
			dis.forward(request, response);
		}
		
		else {
			RequestDispatcher dis = request.getRequestDispatcher("Notupdated.jsp");
			dis.forward(request, response);
		
		
	}
	}
}	


