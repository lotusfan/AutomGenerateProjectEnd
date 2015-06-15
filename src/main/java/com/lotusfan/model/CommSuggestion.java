package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class CommSuggestion extends ParentModel{

	private BigInteger id; //
	private BigInteger userId; //用户Id
	private String contactWay; //联系方式
	private String sugContent; //意见内容
	private Timestamp createTime; //

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
	public String getContactWay() {
		return contactWay;
	}
	public void setContactWay (String contactWay) {
		this.contactWay = contactWay;
	}
	public String getSugContent() {
		return sugContent;
	}
	public void setSugContent (String sugContent) {
		this.sugContent = sugContent;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime (Timestamp createTime) {
		this.createTime = createTime;
	}
}