package com.lotusfan.model;

import java.math.BigInteger;

public class CommDataInfo extends ParentModel{

	private BigInteger id; //
	private String type; //
	private String dataCode; //
	private String dataName; //
	private String status; //1:有效，0:无效

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType (String type) {
		this.type = type;
	}
	public String getDataCode() {
		return dataCode;
	}
	public void setDataCode (String dataCode) {
		this.dataCode = dataCode;
	}
	public String getDataName() {
		return dataName;
	}
	public void setDataName (String dataName) {
		this.dataName = dataName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus (String status) {
		this.status = status;
	}
}