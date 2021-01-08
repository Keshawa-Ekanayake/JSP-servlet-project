
//IT19150826
//D.P KAVINDI GIMSHANI

package com.customer;

public class Bidvalue {

	
	int id;//attributes
	float value;
	String vname;
	int cid;
	int vehicleid;
	
	
	public Bidvalue(int id, float value, String vname, int cid, int vehicleid) {//overload constructor
		
		this.id = id;
		this.value = value;
		this.vname = vname;
		this.cid = cid;
		this.vehicleid = vehicleid;
	}


	public int getId() {//getters and setters
		return id;
	}


	public float getValue() {
		return value;
	}

	
	public String getVname() {
		return vname;
	}

	public int getCid() {
		return cid;
	}

	public int getVehicleid() {
		return vehicleid;
	}


	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	

}
