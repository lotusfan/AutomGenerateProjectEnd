package com.lotusfan.model;

import java.math.BigDecimal;

public class Tauth extends ParentModel{

	private String CID; //
	private String CDESC; //
	private String CNAME; //
	private BigDecimal CSEQ; //
	private String CURL; //
	private String CPID; //

	public String getCID() {
		return CID;
	}
	public void setCID (String CID) {
		this.CID = CID;
	}
	public String getCDESC() {
		return CDESC;
	}
	public void setCDESC (String CDESC) {
		this.CDESC = CDESC;
	}
	public String getCNAME() {
		return CNAME;
	}
	public void setCNAME (String CNAME) {
		this.CNAME = CNAME;
	}
	public BigDecimal getCSEQ() {
		return CSEQ;
	}
	public void setCSEQ (BigDecimal CSEQ) {
		this.CSEQ = CSEQ;
	}
	public String getCURL() {
		return CURL;
	}
	public void setCURL (String CURL) {
		this.CURL = CURL;
	}
	public String getCPID() {
		return CPID;
	}
	public void setCPID (String CPID) {
		this.CPID = CPID;
	}
}