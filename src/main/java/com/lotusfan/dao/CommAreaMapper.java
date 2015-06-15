package com.lotusfan.dao;
import com.lotusfan.model.CommArea;
import java.util.List;
public interface CommAreaMapper{
	public void save(CommArea commArea);
	public void update(CommArea commArea);
	public List<CommArea> getBy(CommArea commArea);
	public CommArea getUniqueBy(CommArea commArea);
	public Integer count(CommArea commArea);
	public List<CommArea> getConditionBy(CommArea commArea);
}