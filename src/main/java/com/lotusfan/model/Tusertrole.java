package com.lotusfan.model;


public class Tusertrole extends ParentModel{

	private String CID; //
	private String CROLEID; //
	private String CUSERID; //

	public String getCID() {
		return CID;
	}
	public void setCID (String CID) {
		this.CID = CID;
	}
	public String getCROLEID() {
		return CROLEID;
	}
	public void setCROLEID (String CROLEID) {
		this.CROLEID = CROLEID;
	}
	public String getCUSERID() {
		return CUSERID;
	}
	public void setCUSERID (String CUSERID) {
		this.CUSERID = CUSERID;
	}
}