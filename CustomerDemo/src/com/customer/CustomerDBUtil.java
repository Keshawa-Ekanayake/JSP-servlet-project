package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBUtil extends CusLogin{
	
	CusLogin ob = new CusLogin();//create a object from CusLogin class.
	
	//IT19150758
	//EKANAYAKE K.L.W
	public static List <Vehicle> getallVehicleDetails(){//get a list of vehicle 
		
		
		
		ArrayList<Vehicle> vehicle = new ArrayList<>();//create a new object from ArrayList
		
		
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/hotel";
	    String user = "root";
	    String pass = "hondapcx2016";
	    String Drivers = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(Drivers);
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "select * from vehicle";//get all the data from vehicle table.
			ResultSet rs1 = stmt.executeQuery(sql);
			
			
			while(rs1.next()) {//checking the row
				
				int vid = rs1.getInt(1);//get the values from database and save into variables.
				String vname = rs1.getString(2);
				String vaddress = rs1.getString(3);
				Float vprice = rs1.getFloat(4);
				String vPhoneNumber = rs1.getString(5);
				String vEmailAddress = rs1.getString(6);
				String vModel = rs1.getString(7);
				int vYear = rs1.getInt(8);
				int vChassisID = rs1.getInt(9);
				int vMilage = rs1.getInt(10);
				
				Vehicle v2 = new Vehicle(vid , vname , vaddress , vprice , vPhoneNumber , vEmailAddress ,vModel , vYear , vChassisID , vMilage);//pass the values.
				vehicle.add(v2);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return vehicle;
	}
	
	//IT19148496
	//ANANDA K.G.R.I.
    
   public static List<Customer> validate(String username, String password) {//validating
	
	ArrayList<Customer> cus = new ArrayList<>();
	
	//create database connection
	try {
		//validate
		con = DBconnect.getConnection();
		stmt = con.createStatement();
	    String sql = "select * from customer where username='"+username+"' and password='"+password+"'";//get all the data from customer table.	    
	    rs = stmt.executeQuery(sql);
	    
	    
	    
	    if(rs.next()) {//checking the row
		int cid = rs.getInt(1);//get the values from database and save into variables.
		String cname = rs.getString(2);
		String email = rs.getString(3);
		String phone = rs.getString(4);
		String userU = rs.getString(5);
		String passU = rs.getString(6);
		
		Customer c = new Customer(cid,cname,email,phone,userU,passU);//pass the values.
		cus.add(c);
	    }
	    
	    
	}
	catch(Exception e) {
	    e.printStackTrace();
	}
	
	return cus;
	
    }
   
 //IT19148496
 //ANANDA K.G.R.I.	

public static boolean insertcustomer(String name, String email, String phone, String username, String password) {//insert customer details.
    	
    	boolean isSuccess = false;
    	
    	//Create Database Connection
    	try {
    		
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into customer values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";//insert data to customer table.
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }

//IT19148496
//ANANDA K.G.R.I.

public static boolean updateDetails(String cid,String cname, String email, String number, String username, String password) {
	
	try {	
		con = DBconnect.getConnection();
		stmt = con.createStatement();
	    String sql = "update customer set name ='"+cname+"',email ='"+email+"',phone ='"+number+"',username ='"+username+"',password ='"+password+"'"
	    			+"where id = '"+cid+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}	
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return isSuccess;
}
	
	

public static List<Customer> getCustomerDetails(String cid){//get customer details.
	
	int conID = Integer.parseInt(cid); //Converting String Value To an Integer Value
	
	ArrayList<Customer> cus = new ArrayList<>();
	try {	
		con = DBconnect.getConnection();
		stmt = con.createStatement();
	    String sql = "Select * from customer where id = '"+conID+"'";
		rs = stmt.executeQuery(sql);//executing the query
		
		while(rs.next()) {
			int id = rs.getInt(1);//get the values from database and save into variables.
			String cname = rs.getString(2);
			String email = rs.getString(3);
			String phone = rs.getString(4);
			String userU = rs.getString(5);
			String passU = rs.getString(6);
			
			Customer cr = new Customer(id,cname,email, phone,userU,passU);
			cus.add(cr);
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	
	return cus;
}



public static boolean deleteCus(String cid) {//delete customer method
	
	int conID = Integer.parseInt(cid); //Converting String Value To an Integer Value
	
	try {	
		con = DBconnect.getConnection();//creating a database connection.
		stmt = con.createStatement();
	    String sql = "delete from customer where id = '"+conID+"'";//delete customer
		int rs = stmt.executeUpdate(sql);//execute query.
		
		if(rs > 0) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}

	return isSuccess;
}




//IT19150758 
//EKANAYAKE K.L.W 
	public static boolean insertvehicles(String Uname ,String Name , String Address , String Price , String PhoneNumber , String EmailAddress ,String Model,String Year,String ChassisID,String Milage) {//insert vehicle details to vehicle table.
		
		CusLogin ob = new CusLogin();
		
		boolean isSuccess = false;
		
		//create db connection
		 String url = "jdbc:mysql://localhost:3306/hotel";
	     String user = "root";
	     String pass = "hondapcx2016";
	     String Drivers = "com.mysql.jdbc.Driver";
	
		
		try {
		
			Class.forName(Drivers);
			Connection con = DriverManager.getConnection(url, user, pass);
	        Statement stmt = con.createStatement();
			String sql = "insert into vehicle (VehicleID,Name,Address,Price,PhoneNumber,EmailAddress,Model,Year,ChassisID,Milage,cid,username) values(0 ,'"+Name+"' ,'"+Address+"' , '"+Price+"' , '"+PhoneNumber+"', '"+EmailAddress+"', '"+Model+"', '"+Year+"', '"+ChassisID+"', '"+Milage+"' , '"+ob.getCusId(Uname)+"' ,'"+Uname+"')";//insert data to vehicle table.
			int rs = stmt.executeUpdate(sql);//execute the query
			
			if(rs > 0) {//checking the value.
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
//IT19150758 
//EKANAYAKE K.L.W 	
public static List<Vehicle> validatevehicle (String Name , String emailaddress){//validate vehicle 
		
		ArrayList<Vehicle> vehicle = new ArrayList<>();
		
		//create database connection
		 String url = "jdbc:mysql://localhost:3306/hotel";
	     String user = "root";
	     String pass = "hondapcx2016";
	     String Drivers = "com.mysql.jdbc.Driver";
		
		
		
		//validate
		//System.out.println(userName+password);
		try {
			
			 Class.forName(Drivers);
			 Connection con = DriverManager.getConnection(url, user, pass);
	         Statement stmt = con.createStatement();
			 String sql = "select * from vehicle where Name = '"+Name+"' and EmailAddress = '"+emailaddress+"'";
			 ResultSet rs1 = stmt.executeQuery(sql);
			
			if(rs1.next()) {
				
				int id = rs1.getInt(1);//get the values from database and save into variables.
				String vname = rs1.getString(2);
				String vaddress = rs1.getString(3);
				Float vprice = rs1.getFloat(4);
				String vPhoneNumber = rs1.getString(5);
				String vEmailAddress = rs1.getString(6);
				String vModel = rs1.getString(7);
				int vYear = rs1.getInt(8);
				int vChassisID = rs1.getInt(9);
				int vMilage = rs1.getInt(10);
				
				Vehicle v = new Vehicle (id , vname , vaddress , vprice , vPhoneNumber , vEmailAddress ,vModel , vYear , vChassisID , vMilage);
				vehicle.add(v);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
			
		return vehicle;
}
		
	
//IT19150758 
//EKANAYAKE K.L.W 
	public static boolean updatesellerdetails (String id , String name ,String Address , String Price , String Phone , String Email , String Model , String Year , String ChassisID , String Milage) {
		
		boolean isSuccess = false;
		
		//create database connection
		 String url = "jdbc:mysql://localhost:3306/hotel";
	     String user = "root";
	     String pass = "hondapcx2016";
	     String Drivers = "com.mysql.jdbc.Driver";
		
		
		
		//validate
		
		
			try {
					Class.forName(Drivers);
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement stmt = con.createStatement();
					String sql = "update vehicle set Name = '"+name+"' , Address ='"+Address+"' , Price = '"+Price+"' , PhoneNumber = '"+Phone+"' , EmailAddress = '"+Email+"' , Model = '"+Model+"' ,Year = '"+Year+"' , ChassisID = '"+ChassisID+"' , Milage = '"+Milage+"' where VehicleID = '"+id+"'";
					int rs = stmt.executeUpdate(sql);
					
					
					if(rs > 0) {
						
						isSuccess = true;
					}
					
					else {
						
						isSuccess = false;
						
					}
			}
			catch(Exception e){
				
				e.printStackTrace();
			}
			
			
		return isSuccess;
		
	}
	
//IT19150758 
//EKANAYAKE K.L.W 	
	public static List <Vehicle> getVehicleDetails(String id){//get vehicle details method.
		
		
		
		ArrayList<Vehicle> vehicle = new ArrayList<>();
		
		int convertedID = Integer.parseInt(id);
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/hotel";
	    String user = "root";
	    String pass = "hondapcx2016";
	    String Drivers = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(Drivers);
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "select * from vehicle where VehicleID = '"+convertedID+"'";//get all the data from vehicle table.
			ResultSet rs1 = stmt.executeQuery(sql);//execute the query.
			
			
			while(rs1.next()) {
				
				int vid = rs1.getInt(1);//get the values from database and save into variables.
				String vname = rs1.getString(2);
				String vaddress = rs1.getString(3);
				Float vprice = rs1.getFloat(4);
				String vPhoneNumber = rs1.getString(5);
				String vEmailAddress = rs1.getString(6);
				String vModel = rs1.getString(7);
				int vYear = rs1.getInt(8);
				int vChassisID = rs1.getInt(9);
				int vMilage = rs1.getInt(10);
				
				Vehicle v2 = new Vehicle(vid , vname , vaddress , vprice , vPhoneNumber , vEmailAddress ,vModel , vYear , vChassisID , vMilage);//pass the values to the overloaded constructor.
				vehicle.add(v2);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return vehicle;
	}
	
//IT19150758 
//EKANAYAKE K.L.W 	
public static boolean deletesellerdetails(String id){ //delete seller details 

	
int convertID = Integer.parseInt(id);

boolean isSuccess = false;
		
		//create database connection
		 String url = "jdbc:mysql://localhost:3306/hotel";
	     String user = "root";
	     String pass = "hondapcx2016";
	     String Drivers = "com.mysql.jdbc.Driver";
		
		
		
		//validate
		
		
			try {
					Class.forName(Drivers);
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement stmt = con.createStatement();
					String Sql = "delete from vehicle where VehicleID = '"+convertID+"'";//delete the vehicle data
					int rs = stmt.executeUpdate(Sql);
					
					if(rs > 0) {
						
						isSuccess = true;
					}
					
					else {
						
						isSuccess = false;
						
					}
								
				
			}
			catch(Exception e){
				
				e.printStackTrace();
			}
			
			
		return isSuccess;
		
	}

//IT19150758 
//EKANAYAKE K.L.W 
public static List<Vehicle> displayvehicle (String model , String year){//display vehicle details.
	

	
	ArrayList<Vehicle> vehicle2 = new ArrayList<>();
	
	//create database connection
	 String url = "jdbc:mysql://localhost:3306/hotel";
     String user = "root";
     String pass = "hondapcx2016";
     String Drivers = "com.mysql.jdbc.Driver";
	
	
	
	//validate
	//System.out.println(userName+password);
	try {
		
		 Class.forName(Drivers);
		 Connection con = DriverManager.getConnection(url, user, pass);
         Statement stmt = con.createStatement();
		 String sql = "select * from vehicle where Model = '"+model+"' or Year = '"+year+"'";//select all data from the vehicle table.
		 ResultSet rs1 = stmt.executeQuery(sql);
		
		if(rs1.next()) {
			
			int id = rs1.getInt(1);//get the values from database and save into variables.
			String vname = rs1.getString(2);
			String vaddress = rs1.getString(3);
			Float vprice = rs1.getFloat(4);
			String vPhoneNumber = rs1.getString(5);
			String vEmailAddress = rs1.getString(6);
			String vModel = rs1.getString(7);
			int vYear = rs1.getInt(8);
			int vChassisID = rs1.getInt(9);
			int vMilage = rs1.getInt(10);
			
			Vehicle v3 = new Vehicle (id , vname , vaddress , vprice , vPhoneNumber , vEmailAddress ,vModel , vYear , vChassisID , vMilage);//pass the values to overloaded constructor.
			vehicle2.add(v3);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
		
	return vehicle2;
}
	
//IT19150826
//D.P KAVINDI GIMSHANI
public static boolean insertBidValue(String value, String username,String id) {//insert bid values to biddingvalues table.
    
	
	
    boolean isSuccess = false;
   
    //db connection
    String url = "jdbc:mysql://localhost:3306/hotel";
    String user = "root";
    String pw = "hondapcx2016";
    String Drivers = "com.mysql.jdbc.Driver";
   
    try {
    	
    
        Class.forName(Drivers);
       
        Connection con = DriverManager.getConnection(url, user, pw);
        Statement s = con.createStatement();
           
            CusLogin ob = new CusLogin();
            
            String sql1 = "insert into biddingvalues (cid,bidding_value,username,VehicleID) values ('"+ob.getCusId(username)+"','"+value+"','"+username+"','"+id+"')";//insert value to biddingvalue table.
            int rs1 = s.executeUpdate(sql1);//execute the query.
                    
            if (rs1 > 0) {
            	isSuccess = true;
            }
            
            else {
                 isSuccess = false;
            }
            		
            	
            	

    	}
    		catch (Exception e) {
    			e.printStackTrace();
    		}
   
   
    	return isSuccess;
    	
    	}

//IT19150826
//D.P KAVINDI GIMSHANI
	public static List <Bidvalue> getBidValues(String name , String vid ){//get bit values from the biddingvalue table.
		
		
		ArrayList <Bidvalue> bvalue = new ArrayList<>();
		
		//db connection
	    String url = "jdbc:mysql://localhost:3306/hotel";
	    String user = "root";
	    String pw = "hondapcx2016";
	    String Drivers = "com.mysql.jdbc.Driver";
	   
	    try {
	    	
	    
	        Class.forName(Drivers);
	       
	        Connection con = DriverManager.getConnection(url, user, pw);
	        Statement s = con.createStatement();
	        String sql = "Select * from biddingvalues where username = '"+name+"' and VehicleID = '"+vid+"'";
	        ResultSet rs = s.executeQuery(sql);
	        
	        
	        while(rs.next()) {
	        	
	        	
	        	int id = rs.getInt(1);//get the values from database and save into variables.
	        	int vehicleid = rs.getInt(2);
	        	String vname = rs.getString(3);
	        	int cid = rs.getInt(4);
	        	float biddingvalue = rs.getFloat(5);
	        	
	        	Bidvalue bd = new Bidvalue (id , biddingvalue , vname , cid , vehicleid);//pass the values to overloaded constructor.
	        	
	        	bvalue.add(bd);
	        }
	        
	        
	        
		
	    }
	    
	    catch(Exception e) {
	    	
	    	e.printStackTrace();
	    }
	       
	    
	    return bvalue; 
	        
	        
	}
	
	
//IT19150826
//D.P KAVINDI GIMSHANI	
	public static boolean updatebidder (String bid, String value, String username, String cusid, String vid) {//update bidding values table.
		
		boolean isSuccess = false;
		
		//create database connection
		 String url = "jdbc:mysql://localhost:3306/hotel";
	     String user = "root";
	     String pass = "hondapcx2016";
	     String Drivers = "com.mysql.jdbc.Driver";
		
		
		
		//validate
		
		
			try {
					Class.forName(Drivers);
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement stmt = con.createStatement();
					String sql = "update biddingvalues set bidding_value = '"+value+"' , username ='"+username+"', VehicleID = '"+vid+"'where id = '"+bid+"'";
					int rs = stmt.executeUpdate(sql);
					
					
					if(rs > 0) {
						
						isSuccess = true;
					}
					
					else {
						
						isSuccess = false;
						
					}
			}
			catch(Exception e){
				
				e.printStackTrace();
			}
			
			
		return isSuccess;
		
	}


//IT19150826
//D.P KAVINDI GIMSHANI	
public static List <Bidvalue> getbiddingdetails(String id){
		
		
		
		ArrayList<Bidvalue> bvalue = new ArrayList<>();
		
		int convertedID = Integer.parseInt(id);
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/hotel";
	    String user = "root";
	    String pass = "hondapcx2016";
	    String Drivers = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(Drivers);
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "Select * from biddingvalues where id = '"+convertedID+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				
				int id1 = rs.getInt(1);
	        	int vehicleid = rs.getInt(2);
	        	String vname = rs.getString(3);
	        	int cid = rs.getInt(4);
	        	float biddingvalue = rs.getFloat(5);
				
	        	Bidvalue bd2 = new Bidvalue (id1 , biddingvalue , vname , cid , vehicleid);
				bvalue.add(bd2);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return bvalue;
	}
	
//IT19150826
//D.P KAVINDI GIMSHANI
public static boolean deletebidderdetails(String id) {

	
int convertID = Integer.parseInt(id);

boolean isSuccess = false;
		
		//create database connection
		 String url = "jdbc:mysql://localhost:3306/hotel";
	     String user = "root";
	     String pass = "hondapcx2016";
	     String Drivers = "com.mysql.jdbc.Driver";
		
		
		
		//validate
		//System.out.println(userName+password);
		
			try {
					Class.forName(Drivers);
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement stmt = con.createStatement();
					String Sql = "delete from biddingvalues where id = '"+convertID+"'";
					int rs = stmt.executeUpdate(Sql);
					
					if(rs > 0) {
						
						isSuccess = true;
					}
					
					else {
						
						isSuccess = false;
						
					}
								
				
			}
			catch(Exception e){
				
				e.printStackTrace();
			}
			
			
		return isSuccess;
		
	}

//IT19151366
//JAYARATHNA I.T


private static Connection con = null;
private static Statement stmt = null;
private static ResultSet rs = null;
private static boolean isSuccess;

//Check account number and bankname
public static List<BankDetails> validate1 (String accountNo , String bankname){
	
	ArrayList<BankDetails> cust1 = new ArrayList<>();
	
	//create db connection
	String url = "jdbc:mysql://localhost:3306/hotel" ;
	String user = "root" ;
	String paswrd = "hondapcx2016";
	String drivers = "com.mysql.jdbc.Driver";
	
	//validate
	
	try {
		
		Class.forName(drivers);
		
		Connection con = DriverManager.getConnection(url , user , paswrd);
		System.out.println("Connecting to server...");
		Statement st = con.createStatement();
		
		String sql = "SELECT * FROM bankdetails WHERE accountNo = '"+accountNo+"' and bankname = '"+bankname+"'";//select all the data from bankdetails table.
		
		ResultSet rs2 = st.executeQuery(sql);
		
		if(rs2.next()) {
			
			int BDid = rs2.getInt(1);//get the values from database and save into variables.
			int cid = rs2.getInt(2);
			String account = rs2.getString(3);
			String bank = rs2.getString(4);
			String holder = rs2.getString(5);
			
			BankDetails bd = new BankDetails(BDid , cid , account , bank , holder);//pass the values to overloaded constructor.
			cust1.add(bd);
		}
		
	}catch (Exception e) {
		e.printStackTrace(); 
	}
	return cust1;
}


//IT19151366
//JAYARATHNA I.T

//insert data method
public static boolean InsertBankDetails(String accntno , String bankname , String accntholder) {
	boolean isSuccess = false;
	
	//create db connection
	String url = "jdbc:mysql://localhost:3306/hotel" ;
	String user = "root" ;
	String paswrd = "hondapcx2016";
	String drivers = "com.mysql.jdbc.Driver";
	
	try {
		
		Class.forName(drivers);
		
		Connection con = DriverManager.getConnection(url , user , paswrd);
		Statement stat = con.createStatement();
		
		String sql = "INSERT INTO bankdetails VALUE (0 , 1 , '"+accntno+"' , '"+bankname+"' , '"+accntholder+"')";//insert data into bankdetails.
		int rs1 = stat.executeUpdate(sql);
		
		if(rs1 > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}


//IT19151366
//JAYARATHNA I.T


//get bank details.
public static List<BankDetails> getdetails (String bankid){
	
	ArrayList<BankDetails> cust1 = new ArrayList<>();
	
	//create db connection
	String url = "jdbc:mysql://localhost:3306/hotel" ;
	String user = "root" ;
	String paswrd = "hondapcx2016";
	String drivers = "com.mysql.jdbc.Driver";
	
	//validate
	
	try {
		
		Class.forName(drivers);
		
		Connection con = DriverManager.getConnection(url , user , paswrd);
		System.out.println("Connecting to server...");
		Statement st = con.createStatement();
		
		String sql = "SELECT * FROM bankdetails WHERE BDid = '"+bankid+"'";//select all the data from bankdetails.
		
		ResultSet rs2 = st.executeQuery(sql);
		
		if(rs2.next()) {
			
			int BDid = rs2.getInt(1);
			int cid = rs2.getInt(2);
			String account = rs2.getString(3);
			String bank = rs2.getString(4);
			String holder = rs2.getString(5);
			
			BankDetails bd = new BankDetails(BDid , cid , account , bank , holder);
			cust1.add(bd);
		}
		
	}catch (Exception e) {
		e.printStackTrace(); 
	}
	return cust1;
}


//IT19151366
//JAYARATHNA I.T

//update the bank details.
public static boolean updateDB (int id , String no , String name , String hname) {
	
	try {
		con = DBconnect.getConnection();
		stmt = con.createStatement();
		String sql = "UPDATE bankdetails SET accountNo = '"+no+"' , bankname = '"+name+"' , accountholder = '"+hname+"'"//update data in bankdetails table.
				+ "WHERE BDid = '"+id+"'";
		
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
			System.out.println("ok");
			
		}
		else {
			isSuccess = false;
			System.out.println("not ok");
		}
		
	}catch (Exception e) {
		e.printStackTrace(); 
	}
	
	return isSuccess;
}


//IT19151366
//JAYARATHNA I.T

//delete data from bankdetails.
public static boolean deleteDB (int id) {
	
	try {
		con = DBconnect.getConnection();
		stmt = con.createStatement();
		String sql = "DELETE FROM bankdetails WHERE BDid = '"+id+"'";//delete data from the bankdetails table
		
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
			System.out.println("ok");
			
		}
		else {
			isSuccess = false;
			System.out.println("not ok");
		}
		
	}catch (Exception e) {
		e.printStackTrace(); 
	}
	
	return isSuccess;

	
}

}
	
	
	
	
	

			
		
		
		
	
	
	
	

	

