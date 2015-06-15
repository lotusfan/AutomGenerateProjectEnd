package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class UserBankcard extends ParentModel{

	private BigInteger id; //
	private BigInteger userId; //
	private String bankName; //
	private String bankCode; //
	private String cardType; //0：信用卡，1：借记卡
	private String cardNo; //
	private Integer activeFlag; //0：绑定，1：解绑
	private Timestamp activeDate; //
	private String bankBranchName; //开户行名称

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName (String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode (String bankCode) {
		this.bankCode = bankCode;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType (String cardType) {
		this.cardType = cardType;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo (String cardNo) {
		this.cardNo = cardNo;
	}
	public Integer getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag (Integer activeFlag) {
		this.activeFlag = activeFlag;
	}
	public Timestamp getActiveDate() {
		return activeDate;
	}
	public void setActiveDate (Timestamp activeDate) {
		this.activeDate = activeDate;
	}
	public String getBankBranchName() {
		return bankBranchName;
	}
	public void setBankBranchName (String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}
}