package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DcBaseInfo extends ParentModel{

	private BigInteger id; //
	private String content; //
	private String title; //
	private BigDecimal consumAmount; //
	private Timestamp createTime; //
	private Timestamp updateTime; //
	private BigInteger userId; //
	private String status; //1:已发布，0:未发布
	private String label; //
	private String areaCode; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent (String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle (String title) {
		this.title = title;
	}
	public BigDecimal getConsumAmount() {
		return consumAmount;
	}
	public void setConsumAmount (BigDecimal consumAmount) {
		this.consumAmount = consumAmount;
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
	public String getLabel() {
		return label;
	}
	public void setLabel (String label) {
		this.label = label;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode (String areaCode) {
		this.areaCode = areaCode;
	}
}