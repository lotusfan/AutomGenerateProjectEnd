package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TransInfo extends ParentModel{

	private BigInteger id; //
	private String type; //小金库：1、梦游券：2、混合类型:3
	private BigDecimal cashAmount; //金额
	private BigDecimal dticketAmount; //梦游券
	private BigInteger userId; //
	private String sourceType; //金额发生的来源
	private String statusValid; //默认1到期2
	private String statusUse; //使用状态0未使用1使用
	private String status; //INITAIL("1","初始状态"),PAYSUCCESS("2","支付成功"),ATTERM("3","到期"),REFUNDING("4","退款中"),REFUND("5","已退款"),
	private BigInteger bizId; //
	private String bizTitle; //项目title
	private String bizType; //
	private String noOrder; //连连商户订单号
	private Timestamp createTime; //
	private Timestamp updateTime; //
	private String checkCode; //校验码

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
	public BigDecimal getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount (BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}
	public BigDecimal getDticketAmount() {
		return dticketAmount;
	}
	public void setDticketAmount (BigDecimal dticketAmount) {
		this.dticketAmount = dticketAmount;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType (String sourceType) {
		this.sourceType = sourceType;
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
	public String getBizTitle() {
		return bizTitle;
	}
	public void setBizTitle (String bizTitle) {
		this.bizTitle = bizTitle;
	}
	public String getBizType() {
		return bizType;
	}
	public void setBizType (String bizType) {
		this.bizType = bizType;
	}
	public String getNoOrder() {
		return noOrder;
	}
	public void setNoOrder (String noOrder) {
		this.noOrder = noOrder;
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
	public String getCheckCode() {
		return checkCode;
	}
	public void setCheckCode (String checkCode) {
		this.checkCode = checkCode;
	}
}