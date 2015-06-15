package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class RtAttendInfo extends ParentModel{

	private BigInteger id; //
	private BigInteger groupId; //
	private Timestamp attendTime; //
	private BigInteger userId; //
	private BigInteger rtId; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigInteger getGroupId() {
		return groupId;
	}
	public void setGroupId (BigInteger groupId) {
		this.groupId = groupId;
	}
	public Timestamp getAttendTime() {
		return attendTime;
	}
	public void setAttendTime (Timestamp attendTime) {
		this.attendTime = attendTime;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public BigInteger getRtId() {
		return rtId;
	}
	public void setRtId (BigInteger rtId) {
		this.rtId = rtId;
	}
}