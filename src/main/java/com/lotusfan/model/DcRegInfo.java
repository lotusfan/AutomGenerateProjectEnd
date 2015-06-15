package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class DcRegInfo extends ParentModel{

	private BigInteger id; //
	private Integer peopleNum; //
	private Integer roomNum; //
	private BigInteger userId; //
	private Timestamp regTime; //
	private String status; //1:登记未处理，2:已处理
	private BigInteger dcId; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public Integer getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum (Integer peopleNum) {
		this.peopleNum = peopleNum;
	}
	public Integer getRoomNum() {
		return roomNum;
	}
	public void setRoomNum (Integer roomNum) {
		this.roomNum = roomNum;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public Timestamp getRegTime() {
		return regTime;
	}
	public void setRegTime (Timestamp regTime) {
		this.regTime = regTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus (String status) {
		this.status = status;
	}
	public BigInteger getDcId() {
		return dcId;
	}
	public void setDcId (BigInteger dcId) {
		this.dcId = dcId;
	}
}