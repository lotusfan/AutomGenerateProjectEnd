package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class UserIncome extends ParentModel{

	private BigInteger id; //
	private BigDecimal incAmount; //收入
	private String type; //1：小金库，2：梦游券
	private String transNo; //交易号
	private String transResult; //
	private BigInteger userId; //用户Id
	private Timestamp incTime; //收入时间

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigDecimal getIncAmount() {
		return incAmount;
	}
	public void setIncAmount (BigDecimal incAmount) {
		this.incAmount = incAmount;
	}
	public String getType() {
		return type;
	}
	public void setType (String type) {
		this.type = type;
	}
	public String getTransNo() {
		return transNo;
	}
	public void setTransNo (String transNo) {
		this.transNo = transNo;
	}
	public String getTransResult() {
		return transResult;
	}
	public void setTransResult (String transResult) {
		this.transResult = transResult;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public Timestamp getIncTime() {
		return incTime;
	}
	public void setIncTime (Timestamp incTime) {
		this.incTime = incTime;
	}
}