package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CfSupportOption extends ParentModel{

	private BigInteger id; //
	private BigInteger productId; //众筹项目Id
	private String supportName; //支持项名称
	private String supportDescription; //支持项名称
	private BigDecimal supportAmount; //支持项金额
	private Integer seqencing; //排序位
	private BigDecimal serviceMoney; //配送费用
	private Integer limitNum; //限定人数
	private Timestamp requiteTime; //预计回报时间
	private Timestamp createTime; //
	private Timestamp updateTime; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigInteger getProductId() {
		return productId;
	}
	public void setProductId (BigInteger productId) {
		this.productId = productId;
	}
	public String getSupportName() {
		return supportName;
	}
	public void setSupportName (String supportName) {
		this.supportName = supportName;
	}
	public String getSupportDescription() {
		return supportDescription;
	}
	public void setSupportDescription (String supportDescription) {
		this.supportDescription = supportDescription;
	}
	public BigDecimal getSupportAmount() {
		return supportAmount;
	}
	public void setSupportAmount (BigDecimal supportAmount) {
		this.supportAmount = supportAmount;
	}
	public Integer getSeqencing() {
		return seqencing;
	}
	public void setSeqencing (Integer seqencing) {
		this.seqencing = seqencing;
	}
	public BigDecimal getServiceMoney() {
		return serviceMoney;
	}
	public void setServiceMoney (BigDecimal serviceMoney) {
		this.serviceMoney = serviceMoney;
	}
	public Integer getLimitNum() {
		return limitNum;
	}
	public void setLimitNum (Integer limitNum) {
		this.limitNum = limitNum;
	}
	public Timestamp getRequiteTime() {
		return requiteTime;
	}
	public void setRequiteTime (Timestamp requiteTime) {
		this.requiteTime = requiteTime;
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