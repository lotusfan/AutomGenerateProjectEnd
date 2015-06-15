package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CfSupportOptionRecord extends ParentModel{

	private BigInteger id; //
	private BigInteger productId; //众筹项目Id
	private String noOrder; //交易记录关联商户号
	private BigInteger supOptionId; //支持项Id
	private BigDecimal supportAmount; //支持金额
	private BigInteger userId; //用户Id
	private Timestamp createTime; //
	private Timestamp updateTime; //
	private String recieveAddr; //收货地址

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public BigInteger getProductId() {
		return productId;
	}
	public void setProductId (BigInteger productId) {
		this.productId = productId;
	}
	public String getNoOrder() {
		return noOrder;
	}
	public void setNoOrder (String noOrder) {
		this.noOrder = noOrder;
	}
	public BigInteger getSupOptionId() {
		return supOptionId;
	}
	public void setSupOptionId (BigInteger supOptionId) {
		this.supOptionId = supOptionId;
	}
	public BigDecimal getSupportAmount() {
		return supportAmount;
	}
	public void setSupportAmount (BigDecimal supportAmount) {
		this.supportAmount = supportAmount;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
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
	public String getRecieveAddr() {
		return recieveAddr;
	}
	public void setRecieveAddr (String recieveAddr) {
		this.recieveAddr = recieveAddr;
	}
}