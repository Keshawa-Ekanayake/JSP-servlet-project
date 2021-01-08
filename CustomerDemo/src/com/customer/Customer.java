//IT19148496
//ANANDA K.G.R.I.


package com.customer;

public class Customer {

	private int cid;//attributes
    private String cname;
    private String email;
    private String number;
    private String username;
    private String password;
    
    
    public Customer(int cid, String cname, String email, String phone, String username, String password) {//overloaded constructor of Customer.
	this.cid = cid;
	this.cname = cname;
	this.email = email;
	this.number = phone;
	this.username = username;
	this.password = password;
	 
}


	public int getCid() {//getters and setters.
		return cid;
	}
	public String getCname() {
		return cname;
	}

	public String getEmail() {
		return email;
	}

	public String getNumber() {
		return number;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	
}
