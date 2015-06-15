package com.lotusfan.model;

import java.math.BigDecimal;

public class Tmenu extends ParentModel{

	private String CID; //
	private String CICONCLS; //
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
	public String getCICONCLS() {
		return CICONCLS;
	}
	public void setCICONCLS (String CICONCLS) {
		this.CICONCLS = CICONCLS;
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