package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RtBaseinfo extends ParentModel{

	private BigInteger id; //
	private String content; //
	private String title; //
	private String suitableNum; //
	private BigDecimal originalPrice; //
	private BigDecimal perConsum; //
	private String label; //
	private String areaCode; //
	private BigInteger userId; //
	private String status; //1:已发布，2：下架
	private BigInteger operator; //
	private Timestamp createTime; //
	private Timestamp updateTime; //
	private Timestamp operatorTime; //
	private Integer sequence; //
	private String detailUrl; //详情页的url

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent (String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle (String title) {
		this.title = title;
	}
	public String getSuitableNum() {
		return suitableNum;
	}
	public void setSuitableNum (String suitableNum) {
		this.suitableNum = suitableNum;
	}
	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice (BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}
	public BigDecimal getPerConsum() {
		return perConsum;
	}
	public void setPerConsum (BigDecimal perConsum) {
		this.perConsum = perConsum;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel (String label) {
		this.label = label;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode (String areaCode) {
		this.areaCode = areaCode;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus (String status) {
		this.status = status;
	}
	public BigInteger getOperator() {
		return operator;
	}
	public void setOperator (BigInteger operator) {
		this.operator = operator;
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
	public Timestamp getOperatorTime() {
		return operatorTime;
	}
	public void setOperatorTime (Timestamp operatorTime) {
		this.operatorTime = operatorTime;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence (Integer sequence) {
		this.sequence = sequence;
	}
	public String getDetailUrl() {
		return detailUrl;
	}
	public void setDetailUrl (String detailUrl) {
		this.detailUrl = detailUrl;
	}
}