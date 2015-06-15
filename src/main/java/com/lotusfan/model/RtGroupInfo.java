package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class RtGroupInfo extends ParentModel{

	private BigInteger id; //
	private BigInteger rtId; //
	private Timestamp activeTime; //
	private String attendNum; //
	private BigInteger userId; //
	private String groupDesc; //
	private String status; //如果过期，则不显示，1:显示，0:不显示
	private Timestamp createTime; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigInteger getRtId() {
		return rtId;
	}
	public void setRtId (BigInteger rtId) {
		this.rtId = rtId;
	}
	public Timestamp getActiveTime() {
		return activeTime;
	}
	public void setActiveTime (Timestamp activeTime) {
		this.activeTime = activeTime;
	}
	public String getAttendNum() {
		return attendNum;
	}
	public void setAttendNum (String attendNum) {
		this.attendNum = attendNum;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public String getGroupDesc() {
		return groupDesc;
	}
	public void setGroupDesc (String groupDesc) {
		this.groupDesc = groupDesc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus (String status) {
		this.status = status;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime (Timestamp createTime) {
		this.createTime = createTime;
	}
}