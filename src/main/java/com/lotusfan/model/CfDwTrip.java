package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class CfDwTrip extends ParentModel{

	private BigInteger id; //
	private BigInteger cfDwId; //
	private Integer dayNum; //
	private String address; //
	private String arrange; //
	private Timestamp createTime; //
	private Timestamp updateTime; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigInteger getCfDwId() {
		return cfDwId;
	}
	public void setCfDwId (BigInteger cfDwId) {
		this.cfDwId = cfDwId;
	}
	public Integer getDayNum() {
		return dayNum;
	}
	public void setDayNum (Integer dayNum) {
		this.dayNum = dayNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress (String address) {
		this.address = address;
	}
	public String getArrange() {
		return arrange;
	}
	public void setArrange (String arrange) {
		this.arrange = arrange;
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
}