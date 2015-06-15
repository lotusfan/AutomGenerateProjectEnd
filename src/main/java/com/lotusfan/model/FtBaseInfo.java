package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FtBaseInfo extends ParentModel{

	private BigInteger id; //
	private String title; //标题
	private String label; //标签
	private BigDecimal amount; //投资期限
	private String address; //目的地址
	private Integer period; //单位：月年化收益
	private BigDecimal yearProfit; //年化收益
	private String planProd; //计划简介
	private String profitDealMd; //收益处理方式
	private String subscPeriod; //产品认购期
	private String subscCondi; //产品认购条件
	private String returnDate; //
	private String valueDate; //产品计息日
	private String isEarlyRedeem; //是否提前赎回
	private String profitCalcMd; //收益计算方式
	private String buyChannel; //购买渠道
	private String fee; //费用说明
	private String investFee; //起投金额
	private Timestamp createTime; //
	private Timestamp updateTime; //
	private String tripDoc; //行程说明连接地址
	private String feeDoc; //行程费用说明连接地址
	private String signDoc; //签字说明连接地址
	private String noticeDoc; //须知说明连接地址
	private String backDoc; //退改规则连接地址
	private String kindlyReminder; //温馨提示连接地址
	private BigInteger operator; //后台操作者ID
	private String status; //显示状态1为显示、2位隐藏
	private Timestamp operatorTime; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle (String title) {
		this.title = title;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel (String label) {
		this.label = label;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount (BigDecimal amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress (String address) {
		this.address = address;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod (Integer period) {
		this.period = period;
	}
	public BigDecimal getYearProfit() {
		return yearProfit;
	}
	public void setYearProfit (BigDecimal yearProfit) {
		this.yearProfit = yearProfit;
	}
	public String getPlanProd() {
		return planProd;
	}
	public void setPlanProd (String planProd) {
		this.planProd = planProd;
	}
	public String getProfitDealMd() {
		return profitDealMd;
	}
	public void setProfitDealMd (String profitDealMd) {
		this.profitDealMd = profitDealMd;
	}
	public String getSubscPeriod() {
		return subscPeriod;
	}
	public void setSubscPeriod (String subscPeriod) {
		this.subscPeriod = subscPeriod;
	}
	public String getSubscCondi() {
		return subscCondi;
	}
	public void setSubscCondi (String subscCondi) {
		this.subscCondi = subscCondi;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate (String returnDate) {
		this.returnDate = returnDate;
	}
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate (String valueDate) {
		this.valueDate = valueDate;
	}
	public String getIsEarlyRedeem() {
		return isEarlyRedeem;
	}
	public void setIsEarlyRedeem (String isEarlyRedeem) {
		this.isEarlyRedeem = isEarlyRedeem;
	}
	public String getProfitCalcMd() {
		return profitCalcMd;
	}
	public void setProfitCalcMd (String profitCalcMd) {
		this.profitCalcMd = profitCalcMd;
	}
	public String getBuyChannel() {
		return buyChannel;
	}
	public void setBuyChannel (String buyChannel) {
		this.buyChannel = buyChannel;
	}
	public String getFee() {
		return fee;
	}
	public void setFee (String fee) {
		this.fee = fee;
	}
	public String getInvestFee() {
		return investFee;
	}
	public void setInvestFee (String investFee) {
		this.investFee = investFee;
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
	public String getTripDoc() {
		return tripDoc;
	}
	public void setTripDoc (String tripDoc) {
		this.tripDoc = tripDoc;
	}
	public String getFeeDoc() {
		return feeDoc;
	}
	public void setFeeDoc (String feeDoc) {
		this.feeDoc = feeDoc;
	}
	public String getSignDoc() {
		return signDoc;
	}
	public void setSignDoc (String signDoc) {
		this.signDoc = signDoc;
	}
	public String getNoticeDoc() {
		return noticeDoc;
	}
	public void setNoticeDoc (String noticeDoc) {
		this.noticeDoc = noticeDoc;
	}
	public String getBackDoc() {
		return backDoc;
	}
	public void setBackDoc (String backDoc) {
		this.backDoc = backDoc;
	}
	public String getKindlyReminder() {
		return kindlyReminder;
	}
	public void setKindlyReminder (String kindlyReminder) {
		this.kindlyReminder = kindlyReminder;
	}
	public BigInteger getOperator() {
		return operator;
	}
	public void setOperator (BigInteger operator) {
		this.operator = operator;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus (String status) {
		this.status = status;
	}
	public Timestamp getOperatorTime() {
		return operatorTime;
	}
	public void setOperatorTime (Timestamp operatorTime) {
		this.operatorTime = operatorTime;
	}
}