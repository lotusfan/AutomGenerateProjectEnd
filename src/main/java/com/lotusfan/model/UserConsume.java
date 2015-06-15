package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class UserConsume extends ParentModel{

	private BigInteger id; //
	private BigDecimal conAmount; //
	private String type; //
	private Timestamp payDate; //
	private String status; //
	private BigInteger userId; //
	private BigInteger bizId; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigDecimal getConAmount() {
		return conAmount;
	}
	public void setConAmount (BigDecimal conAmount) {
		this.conAmount = conAmount;
	}
	public String getType() {
		return type;
	}
	public void setType (String type) {
		this.type = type;
	}
	public Timestamp getPayDate() {
		return payDate;
	}
	public void setPayDate (Timestamp payDate) {
		this.payDate = payDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus (String status) {
		this.status = status;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public BigInteger getBizId() {
		return bizId;
	}
	public void setBizId (BigInteger bizId) {
		this.bizId = bizId;
	}
}