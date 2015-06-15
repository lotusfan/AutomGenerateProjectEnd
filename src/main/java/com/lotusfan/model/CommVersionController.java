package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class CommVersionController extends ParentModel{

	private BigInteger id; //
	private Integer mtType; //终端类型（IosAndroid网站）
	private String versionCodeOld; //旧版本号
	private String versionCodeNew; //新版本号
	private String upContent; //功能更新显示的内容
	private Timestamp upTime; //更新显示时间
	private String path; //新版本下载地址
	private Timestamp createTime; //
	private Timestamp updateTime; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public Integer getMtType() {
		return mtType;
	}
	public void setMtType (Integer mtType) {
		this.mtType = mtType;
	}
	public String getVersionCodeOld() {
		return versionCodeOld;
	}
	public void setVersionCodeOld (String versionCodeOld) {
		this.versionCodeOld = versionCodeOld;
	}
	public String getVersionCodeNew() {
		return versionCodeNew;
	}
	public void setVersionCodeNew (String versionCodeNew) {
		this.versionCodeNew = versionCodeNew;
	}
	public String getUpContent() {
		return upContent;
	}
	public void setUpContent (String upContent) {
		this.upContent = upContent;
	}
	public Timestamp getUpTime() {
		return upTime;
	}
	public void setUpTime (Timestamp upTime) {
		this.upTime = upTime;
	}
	public String getPath() {
		return path;
	}
	public void setPath (String path) {
		this.path = path;
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