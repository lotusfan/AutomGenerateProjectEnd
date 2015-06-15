package com.lotusfan.model;

import java.math.BigInteger;
import java.math.BigDecimal;

public class MyTicketHelp extends ParentModel{

	private BigInteger id; //
	private String telphone; //
	private BigDecimal counts; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone (String telphone) {
		this.telphone = telphone;
	}
	public BigDecimal getCounts() {
		return counts;
	}
	public void setCounts (BigDecimal counts) {
		this.counts = counts;
	}
}