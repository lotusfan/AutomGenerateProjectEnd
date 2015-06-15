package com.lotusfan.model;

import java.math.BigDecimal;

public class Tdept extends ParentModel{

	private String CID; //
	private String CDESC; //
	private String CICONCLS; //
	private String CNAME; //
	private BigDecimal CSEQ; //
	private String CPID; //
	private String comCoed; //
	private String ctArea; //

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
	public String getCPID() {
		return CPID;
	}
	public void setCPID (String CPID) {
		this.CPID = CPID;
	}
	public String getComCoed() {
		return comCoed;
	}
	public void setComCoed (String comCoed) {
		this.comCoed = comCoed;
	}
	public String getCtArea() {
		return ctArea;
	}
	public void setCtArea (String ctArea) {
		this.ctArea = ctArea;
	}
}