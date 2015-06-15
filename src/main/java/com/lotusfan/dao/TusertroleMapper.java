package com.lotusfan.dao;
import com.lotusfan.model.Tusertrole;
import java.util.List;
public interface TusertroleMapper{
	public void save(Tusertrole tusertrole);
	public void update(Tusertrole tusertrole);
	public List<Tusertrole> getBy(Tusertrole tusertrole);
	public Tusertrole getUniqueBy(Tusertrole tusertrole);
	public Integer count(Tusertrole tusertrole);
	public List<Tusertrole> getConditionBy(Tusertrole tusertrole);
}