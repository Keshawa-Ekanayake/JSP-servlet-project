//IT19151366
//JAYARATHNA I.T


package com.customer;

public class BankDetails {

	//variables declaration
	private int BDid;
	private int cid;
	private String accountNo; 
	private String bankname;
	private String accountholder;
	
	//constructor	
	public BankDetails(int BDid , int cid , String accountNo, String bankname, String accountholder) {
		this.BDid = BDid;
		this.cid = cid;
		this.accountNo = accountNo;
		this.bankname = bankname;
		this.accountholder = accountholder;
	}

	//getters
	public int getBDid() {
		return BDid;
	}


	public int getCid() {
		return cid;
	}
	

	public String getAccnountNo() {
		return accountNo;
	}
	

	public String getBankname() {
		return bankname;
	}


	public String getAccountholder() {
		return accountholder;
	}
	

}
