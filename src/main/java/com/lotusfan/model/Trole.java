package com.lotusfan.model;


public class Trole extends ParentModel{

	private String CID; //
	private String CDESC; //
	private String CNAME; //
	private Integer roletype; //角色类型1：超级管理2：系统管理员3：操作员

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
	public Integer getRoletype() {
		return roletype;
	}
	public void setRoletype (Integer roletype) {
		this.roletype = roletype;
	}
}