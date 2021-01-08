package com.customer;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnect {//the database connection class.
	
	private static String url = "jdbc:mysql://localhost:3306/hotel" ;//creating the database.
	private static String user = "root" ;
	private static String paswrd = "hondapcx2016";
	private static String drivers = "com.mysql.jdbc.Driver";
	private static Connection con;
	
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName(drivers);
			con = DriverManager.getConnection(url , user , paswrd);
			
		}catch(Exception e) {
			System.out.println("DataBase is not connected!!");
		}
		return con;
		
	}
	
}
