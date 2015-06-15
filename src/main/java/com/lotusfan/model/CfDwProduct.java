package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CfDwProduct extends ParentModel{

	private BigInteger id; //
	private BigInteger userId; //创建人
	private Timestamp startTime; //项目开始时间
	private Timestamp endTime; //项目结束时间
	private BigDecimal moneyTotal; //筹集需要的总金额
	private String description; //项目描述
	private String address; //位置1
	private String dwType; //梦想类型
	private String title; //项目名称
	private Integer sequence; //排序号
	private Timestamp createTime; //
	private Timestamp updateTime; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime (Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime (Timestamp endTime) {
		this.endTime = endTime;
	}
	public BigDecimal getMoneyTotal() {
		return moneyTotal;
	}
	public void setMoneyTotal (BigDecimal moneyTotal) {
		this.moneyTotal = moneyTotal;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription (String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress (String address) {
		this.address = address;
	}
	public String getDwType() {
		return dwType;
	}
	public void setDwType (String dwType) {
		this.dwType = dwType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle (String title) {
		this.title = title;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence (Integer sequence) {
		this.sequence = sequence;
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