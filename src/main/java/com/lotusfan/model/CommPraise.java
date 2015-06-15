package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class CommPraise extends ParentModel{

	private BigInteger id; //
	private BigInteger userId; //
	private BigInteger bizId; //
	private String bizType; //
	private Timestamp createTime; //
	private String praiseType; //

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
	public String getPraiseType() {
		return praiseType;
	}
	public void setPraiseType (String praiseType) {
		this.praiseType = praiseType;
	}
}