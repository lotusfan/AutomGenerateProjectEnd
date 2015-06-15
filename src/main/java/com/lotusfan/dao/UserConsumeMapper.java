package com.lotusfan.dao;
import com.lotusfan.model.UserConsume;
import java.util.List;
public interface UserConsumeMapper{
	public void save(UserConsume userConsume);
	public void update(UserConsume userConsume);
	public List<UserConsume> getBy(UserConsume userConsume);
	public UserConsume getUniqueBy(UserConsume userConsume);
	public Integer count(UserConsume userConsume);
	public List<UserConsume> getConditionBy(UserConsume userConsume);
}