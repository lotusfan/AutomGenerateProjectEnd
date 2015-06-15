package com.lotusfan.dao;
import com.lotusfan.model.Tuserrole;
import java.util.List;
public interface TuserroleMapper{
	public void save(Tuserrole tuserrole);
	public void update(Tuserrole tuserrole);
	public List<Tuserrole> getBy(Tuserrole tuserrole);
	public Tuserrole getUniqueBy(Tuserrole tuserrole);
	public Integer count(Tuserrole tuserrole);
	public List<Tuserrole> getConditionBy(Tuserrole tuserrole);
}