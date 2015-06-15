package com.lotusfan.dao;
import com.lotusfan.model.Tdept;
import java.util.List;
public interface TdeptMapper{
	public void save(Tdept tdept);
	public void update(Tdept tdept);
	public List<Tdept> getBy(Tdept tdept);
	public Tdept getUniqueBy(Tdept tdept);
	public Integer count(Tdept tdept);
	public List<Tdept> getConditionBy(Tdept tdept);
}