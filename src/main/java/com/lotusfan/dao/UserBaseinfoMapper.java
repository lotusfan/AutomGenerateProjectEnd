package com.lotusfan.dao;
import com.lotusfan.model.UserBaseinfo;
import java.util.List;
public interface UserBaseinfoMapper{
	public void save(UserBaseinfo userBaseinfo);
	public void update(UserBaseinfo userBaseinfo);
	public List<UserBaseinfo> getBy(UserBaseinfo userBaseinfo);
	public UserBaseinfo getUniqueBy(UserBaseinfo userBaseinfo);
	public Integer count(UserBaseinfo userBaseinfo);
	public List<UserBaseinfo> getConditionBy(UserBaseinfo userBaseinfo);
}