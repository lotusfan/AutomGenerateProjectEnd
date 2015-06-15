package com.lotusfan.dao;
import com.lotusfan.model.Trole;
import java.util.List;
public interface TroleMapper{
	public void save(Trole trole);
	public void update(Trole trole);
	public List<Trole> getBy(Trole trole);
	public Trole getUniqueBy(Trole trole);
	public Integer count(Trole trole);
	public List<Trole> getConditionBy(Trole trole);
}