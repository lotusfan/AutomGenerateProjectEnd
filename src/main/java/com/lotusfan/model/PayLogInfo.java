package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PayLogInfo extends ParentModel{

	private BigInteger id; //
	private String logName; //
	private BigDecimal cashAmount; //
	private BigInteger userId; //
	private String status; //成功：1，失败：0
	private Timestamp createTime; //
	private Timestamp updateTime; //
	private String transType; //
	private String noOrder; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public String getLogName() {
		return logName;
	}
	public void setLogName (String logName) {
		this.logName = logName;
	}
	public BigDecimal getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount (BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus (String status) {
		this.status = status;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime (Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime (Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType (String transType) {
		this.transType = transType;
	}
	public String getNoOrder() {
		return noOrder;
	}
	public void setNoOrder (String noOrder) {
		this.noOrder = noOrder;
	}
}