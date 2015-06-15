package com.lotusfan.dao;
import com.lotusfan.model.UserBankcard;
import java.util.List;
public interface UserBankcardMapper{
	public void save(UserBankcard userBankcard);
	public void update(UserBankcard userBankcard);
	public List<UserBankcard> getBy(UserBankcard userBankcard);
	public UserBankcard getUniqueBy(UserBankcard userBankcard);
	public Integer count(UserBankcard userBankcard);
	public List<UserBankcard> getConditionBy(UserBankcard userBankcard);
}