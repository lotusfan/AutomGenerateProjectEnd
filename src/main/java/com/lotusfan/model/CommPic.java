package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class CommPic extends ParentModel{

	private BigInteger id; //
	private String bizType; //1用户头像，2助梦游图片，3梦广场，4周边游，5梦经典，6惠梦游，7更新日志图片，8支持项
	private BigInteger bizId; //相关联的Id
	private Integer flag; //标识位：1,用户头像使用，0用户头像未使用；
	private String suffix; //图片后缀格式
	private String url; //图片Url
	private Timestamp createTime; //
	private Timestamp updateTime; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public String getBizType() {
		return bizType;
	}
	public void setBizType (String bizType) {
		this.bizType = bizType;
	}
	public BigInteger getBizId() {
		return bizId;
	}
	public void setBizId (BigInteger bizId) {
		this.bizId = bizId;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag (Integer flag) {
		this.flag = flag;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix (String suffix) {
		this.suffix = suffix;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl (String url) {
		this.url = url;
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