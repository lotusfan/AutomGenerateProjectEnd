package com.lotusfan.dao;
import com.lotusfan.model.Tauth;
import java.util.List;
public interface TauthMapper{
	public void save(Tauth tauth);
	public void update(Tauth tauth);
	public List<Tauth> getBy(Tauth tauth);
	public Tauth getUniqueBy(Tauth tauth);
	public Integer count(Tauth tauth);
	public List<Tauth> getConditionBy(Tauth tauth);
}