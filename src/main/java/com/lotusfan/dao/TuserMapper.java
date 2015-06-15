package com.lotusfan.dao;
import com.lotusfan.model.Tuser;
import java.util.List;
public interface TuserMapper{
	public void save(Tuser tuser);
	public void update(Tuser tuser);
	public List<Tuser> getBy(Tuser tuser);
	public Tuser getUniqueBy(Tuser tuser);
	public Integer count(Tuser tuser);
	public List<Tuser> getConditionBy(Tuser tuser);
}