package com.lotusfan.dao;
import com.lotusfan.model.UserIncome;
import java.util.List;
public interface UserIncomeMapper{
	public void save(UserIncome userIncome);
	public void update(UserIncome userIncome);
	public List<UserIncome> getBy(UserIncome userIncome);
	public UserIncome getUniqueBy(UserIncome userIncome);
	public Integer count(UserIncome userIncome);
	public List<UserIncome> getConditionBy(UserIncome userIncome);
}