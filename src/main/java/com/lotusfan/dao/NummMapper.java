package com.lotusfan.dao;
import com.lotusfan.model.Numm;
import java.util.List;
public interface NummMapper{
	public void save(Numm numm);
	public void update(Numm numm);
	public List<Numm> getBy(Numm numm);
	public Numm getUniqueBy(Numm numm);
	public Integer count(Numm numm);
	public List<Numm> getConditionBy(Numm numm);
}