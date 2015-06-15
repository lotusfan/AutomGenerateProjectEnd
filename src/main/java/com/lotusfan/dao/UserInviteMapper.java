package com.lotusfan.dao;
import com.lotusfan.model.UserInvite;
import java.util.List;
public interface UserInviteMapper{
	public void save(UserInvite userInvite);
	public void update(UserInvite userInvite);
	public List<UserInvite> getBy(UserInvite userInvite);
	public UserInvite getUniqueBy(UserInvite userInvite);
	public Integer count(UserInvite userInvite);
	public List<UserInvite> getConditionBy(UserInvite userInvite);
}