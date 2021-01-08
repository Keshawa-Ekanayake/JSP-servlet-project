
//IT19150826
//D.P KAVINDI GIMSHANI
package com.customer;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class CusLogin {
	
	
	int id;
	int vehicleid;//variables
    
    public int getCusId(String username){
        
        //db connection
        String url = "jdbc:mysql://localhost:3306/hotel";
        String user = "root";
        String pw = "hondapcx2016";
        String Drivers = "com.mysql.jdbc.Driver";
        
        try {
            
            Class.forName(Drivers);
            
            Connection con = DriverManager.getConnection(url, user, pw);
            Statement s = con.createStatement();
            
            String sql2 = "select * from customer where username = '"+username+"'";//get all the data from customer table.
            ResultSet rs2 = s.executeQuery(sql2);//execute the query
            
            if(rs2.next()) {//checking the row
                id = rs2.getInt(1);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
    
    
        
           
    
}
