
//IT19150758 
//EKANAYAKE K.L.W 

package com.customer;

public class Vehicle extends CusLogin{

	private int id;//attributes
	private String vname;
	private String vaddress;
	private float vprice;
	private String vPhoneNumber;
	private String vEmailAddress;
	private String vModel;
	private int vYear;
	private int vChassisID;
	private int vMilage;
	
	
	
	


	

	public Vehicle(int id, String vname, String vaddress, float vprice, String vPhoneNumber, String vEmailAddress,
			String vModel, int vYear, int vChassisID, int vMilage) {//overloaded constructor.
		super();
		this.id = id;
		this.vname = vname;
		this.vaddress = vaddress;
		this.vprice = vprice;
		this.vPhoneNumber = vPhoneNumber;
		this.vEmailAddress = vEmailAddress;
		this.vModel = vModel;
		this.vYear = vYear;
		this.vChassisID = vChassisID;
		this.vMilage = vMilage;
	}

	public int getId() {//getters and setters.
		return id;
	}

	public String getVname() {
		return vname;
	}

	public String getVaddress() {
		return vaddress;
	}
	
	public float getVprice() {
		return vprice;
	}

	public String getvPhoneNumber() {
		return vPhoneNumber;
	}

	public String getvEmailAddress() {
		return vEmailAddress;
	}

	public String getvModel() {
		return vModel;
	}

	public int getvYear() {
		return vYear;
	}
	
	public int getvChassisID() {
		return vChassisID;
	}

	public int getvMilage() {
		return vMilage;
	}



	
	
		
}
