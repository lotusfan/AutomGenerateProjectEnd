package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TransLog extends ParentModel{

	private BigInteger id; //
	private BigInteger dticketAmount; //梦游券
	private BigDecimal cashAmount; //现金
	private BigInteger userId; //
	private String statusValid; //默认1到期2
	private String statusUse; //使用状态0未使用1已使用
	private String status; //INITAIL("1","初始状态"),PAYSUCCESS("2","支付成功"),ATTERM("3","到期"),REFUNDING("4","退款中"),REFUND("5","已退款"),
	private BigInteger bizId; //
	private String bizType; //
	private Timestamp createTime; //
	private Timestamp updateTime; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigInteger getDticketAmount() {
		return dticketAmount;
	}
	public void setDticketAmount (BigInteger dticketAmount) {
		this.dticketAmount = dticketAmount;
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
	public String getStatusValid() {
		return statusValid;
	}
	public void setStatusValid (String statusValid) {
		this.statusValid = statusValid;
	}
	public String getStatusUse() {
		return statusUse;
	}
	public void setStatusUse (String statusUse) {
		this.statusUse = statusUse;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus (String status) {
		this.status = status;
	}
	public BigInteger getBizId() {
		return bizId;
	}
	public void setBizId (BigInteger bizId) {
		this.bizId = bizId;
	}
	public String getBizType() {
		return bizType;
	}
	public void setBizType (String bizType) {
		this.bizType = bizType;
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
}