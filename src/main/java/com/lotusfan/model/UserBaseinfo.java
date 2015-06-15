package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class UserBaseinfo extends ParentModel{

	private BigInteger userId; //
	private String nickName; //用户昵称
	private String realName; //用户实名
	private String sex; //性别1是男2是女
	private Timestamp birth; //生日
	private String bloodType; //血型
	private String occupation; //职业
	private String company; //公司
	private String invitationCode; //邀请码
	private BigDecimal dticketAmount; //助梦金
	private BigDecimal coffersAmount; //
	private String idcard; //身份证
	private String loginName; //登录账号
	private String password; //登录密码
	private Timestamp registerTime; //注册时间
	private String mylabel; //个性标签（jsonArray）
	private String bankAccount; //银行卡号
	private Integer age; //
	private String dreamid; //
	private String email; //email
	private String address; //位置1
	private Timestamp createTime; //
	private Timestamp updateTime; //
	private String recieveAddr; //收货地址
	private String isFirstcompleteinfo; //是否完善过个人信息：0-未完成，1-已完成
	private String isAdmin; //是否是管理员用户：0-不是，1-是

	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId (BigInteger userId) {
		this.userId = userId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName (String nickName) {
		this.nickName = nickName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName (String realName) {
		this.realName = realName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex (String sex) {
		this.sex = sex;
	}
	public Timestamp getBirth() {
		return birth;
	}
	public void setBirth (Timestamp birth) {
		this.birth = birth;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType (String bloodType) {
		this.bloodType = bloodType;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation (String occupation) {
		this.occupation = occupation;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany (String company) {
		this.company = company;
	}
	public String getInvitationCode() {
		return invitationCode;
	}
	public void setInvitationCode (String invitationCode) {
		this.invitationCode = invitationCode;
	}
	public BigDecimal getDticketAmount() {
		return dticketAmount;
	}
	public void setDticketAmount (BigDecimal dticketAmount) {
		this.dticketAmount = dticketAmount;
	}
	public BigDecimal getCoffersAmount() {
		return coffersAmount;
	}
	public void setCoffersAmount (BigDecimal coffersAmount) {
		this.coffersAmount = coffersAmount;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard (String idcard) {
		this.idcard = idcard;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName (String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword (String password) {
		this.password = password;
	}
	public Timestamp getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime (Timestamp registerTime) {
		this.registerTime = registerTime;
	}
	public String getMylabel() {
		return mylabel;
	}
	public void setMylabel (String mylabel) {
		this.mylabel = mylabel;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount (String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge (Integer age) {
		this.age = age;
	}
	public String getDreamid() {
		return dreamid;
	}
	public void setDreamid (String dreamid) {
		this.dreamid = dreamid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail (String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress (String address) {
		this.address = address;
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
	public String getIsFirstcompleteinfo() {
		return isFirstcompleteinfo;
	}
	public void setIsFirstcompleteinfo (String isFirstcompleteinfo) {
		this.isFirstcompleteinfo = isFirstcompleteinfo;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin (String isAdmin) {
		this.isAdmin = isAdmin;
	}
}