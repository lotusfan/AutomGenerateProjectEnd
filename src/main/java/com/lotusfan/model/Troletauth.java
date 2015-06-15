package com.lotusfan.model;


public class Troletauth extends ParentModel{

	private String CID; //
	private String CAUTHID; //
	private String CROLEID; //

	public String getCID() {
		return CID;
	}
	public void setCID (String CID) {
		this.CID = CID;
	}
	public String getCAUTHID() {
		return CAUTHID;
	}
	public void setCAUTHID (String CAUTHID) {
		this.CAUTHID = CAUTHID;
	}
	public String getCROLEID() {
		return CROLEID;
	}
	public void setCROLEID (String CROLEID) {
		this.CROLEID = CROLEID;
	}
}