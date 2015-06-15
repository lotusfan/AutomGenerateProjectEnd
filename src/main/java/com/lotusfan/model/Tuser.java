package com.lotusfan.model;

import java.sql.Timestamp;

public class Tuser extends ParentModel{

	private String CID; //
	private Timestamp CCREATEDATETIME; //
	private String CEMAIL; //
	private Timestamp CMODIFYDATETIME; //
	private String CNAME; //
	private String CPWD; //
	private String CREALNAME; //
	private String CSN; //
	private String CSTATUS; //
	private String CDEPTID; //

	public String getCID() {
		return CID;
	}
	public void setCID (String CID) {
		this.CID = CID;
	}
	public Timestamp getCCREATEDATETIME() {
		return CCREATEDATETIME;
	}
	public void setCCREATEDATETIME (Timestamp CCREATEDATETIME) {
		this.CCREATEDATETIME = CCREATEDATETIME;
	}
	public String getCEMAIL() {
		return CEMAIL;
	}
	public void setCEMAIL (String CEMAIL) {
		this.CEMAIL = CEMAIL;
	}
	public Timestamp getCMODIFYDATETIME() {
		return CMODIFYDATETIME;
	}
	public void setCMODIFYDATETIME (Timestamp CMODIFYDATETIME) {
		this.CMODIFYDATETIME = CMODIFYDATETIME;
	}
	public String getCNAME() {
		return CNAME;
	}
	public void setCNAME (String CNAME) {
		this.CNAME = CNAME;
	}
	public String getCPWD() {
		return CPWD;
	}
	public void setCPWD (String CPWD) {
		this.CPWD = CPWD;
	}
	public String getCREALNAME() {
		return CREALNAME;
	}
	public void setCREALNAME (String CREALNAME) {
		this.CREALNAME = CREALNAME;
	}
	public String getCSN() {
		return CSN;
	}
	public void setCSN (String CSN) {
		this.CSN = CSN;
	}
	public String getCSTATUS() {
		return CSTATUS;
	}
	public void setCSTATUS (String CSTATUS) {
		this.CSTATUS = CSTATUS;
	}
	public String getCDEPTID() {
		return CDEPTID;
	}
	public void setCDEPTID (String CDEPTID) {
		this.CDEPTID = CDEPTID;
	}
}