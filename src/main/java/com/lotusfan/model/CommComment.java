package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class CommComment extends ParentModel{

	private BigInteger id; //
	private BigInteger bizId; //项目Id
	private BigInteger userId; //用户Id
	private String content; //评论内容
	private Timestamp createTime; //
	private String bizType; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigInteger getBizId() {
		return bizId;
	}
	public void setBizId (BigInteger bizId) {
		this.bizId = bizId;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent (String content) {
		this.content = content;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime (Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getBizType() {
		return bizType;
	}
	public void setBizType (String bizType) {
		this.bizType = bizType;
	}
}