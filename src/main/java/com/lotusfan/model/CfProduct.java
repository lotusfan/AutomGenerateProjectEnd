package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CfProduct extends ParentModel{

	private BigInteger id; //
	private BigInteger userId; //创建人
	private Timestamp startTime; //项目开始时间
	private Timestamp endTime; //项目结束时间
	private BigDecimal moneyTotal; //筹集需要的总金额
	private BigInteger operator; //操作员Id
	private Timestamp operateTime; //操作时间
	private Integer foundStatus; //筹款状态1筹集中2筹集成功3筹集失败
	private Integer status; //状态（1上线2下线）
	private String description; //项目描述
	private String address; //位置1
	private String label; //项目类型
	private String title; //项目名称
	private Integer sequence; //排序号
	private Timestamp createTime; //
	private Timestamp updateTime; //
	private String supUrl; //支持内容url

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
	public BigInteger getOperator() {
		return operator;
	}
	public void setOperator (BigInteger operator) {
		this.operator = operator;
	}
	public Timestamp getOperateTime() {
		return operateTime;
	}
	public void setOperateTime (Timestamp operateTime) {
		this.operateTime = operateTime;
	}
	public Integer getFoundStatus() {
		return foundStatus;
	}
	public void setFoundStatus (Integer foundStatus) {
		this.foundStatus = foundStatus;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus (Integer status) {
		this.status = status;
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
	public String getLabel() {
		return label;
	}
	public void setLabel (String label) {
		this.label = label;
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
	public String getSupUrl() {
		return supUrl;
	}
	public void setSupUrl (String supUrl) {
		this.supUrl = supUrl;
	}
}