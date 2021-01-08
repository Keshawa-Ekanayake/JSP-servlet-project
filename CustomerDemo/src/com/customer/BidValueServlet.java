
//IT19150826
//D.P KAVINDI GIMSHANI

package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BidValueServlet")
public class BidValueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String value = request.getParameter("value");//get values from the form and saves in variables.
        String user = request.getParameter("user");
        String id = request.getParameter("id");
        
        boolean isTrue;
        
        isTrue = CustomerDBUtil.insertBidValue(value, user , id);//the return value insertBidValue method saves in isTrue variable.
        
        if (isTrue == true) {
            
            RequestDispatcher dis = request.getRequestDispatcher("Bank.jsp");//prompt Bank.jsp page.
            
            dis.forward(request, response);
                
        }
        else {
            
            RequestDispatcher dis1 = request.getRequestDispatcher("Error.jsp");////prompt Error.jsp page.
            
            dis1.forward(request, response);
            
}
	}
}