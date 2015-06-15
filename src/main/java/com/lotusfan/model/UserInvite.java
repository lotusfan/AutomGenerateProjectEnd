package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class UserInvite extends ParentModel{

	private Timestamp createTime; //
	private BigInteger userId; //
	private String inviteCode; //用户邀请码
	private BigInteger id; //

	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime (Timestamp createTime) {
		this.createTime = createTime;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode (String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
}