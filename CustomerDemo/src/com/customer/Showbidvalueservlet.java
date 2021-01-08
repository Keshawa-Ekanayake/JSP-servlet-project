
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


@WebServlet("/Showbidvalueservlet")
public class Showbidvalueservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
        String vid = request.getParameter("vid");
        		
        		
        try {
			
        	
			List<Bidvalue> bidvalue = CustomerDBUtil.getBidValues(username, vid);
			request.setAttribute("bidvalue",bidvalue );
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
        
            
        RequestDispatcher dis = request.getRequestDispatcher("Bank.jsp");
            
        dis.forward(request, response);
     
	}		

}
