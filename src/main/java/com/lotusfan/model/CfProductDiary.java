package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class CfProductDiary extends ParentModel{

	private BigInteger id; //
	private BigInteger crowdfundId; //众筹项目Id
	private String content; //日志内容
	private String address; //地址标示：国家，省市，地区
	private Timestamp createTime; //
	private Timestamp updateTime; //
	private String title; //标题

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigInteger getCrowdfundId() {
		return crowdfundId;
	}
	public void setCrowdfundId (BigInteger crowdfundId) {
		this.crowdfundId = crowdfundId;
	}
	public String getContent() {
		return content;
	}
	public void setContent (String content) {
		this.content = content;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress (String address) {
		this.address = address;
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
	public String getTitle() {
		return title;
	}
	public void setTitle (String title) {
		this.title = title;
	}
}