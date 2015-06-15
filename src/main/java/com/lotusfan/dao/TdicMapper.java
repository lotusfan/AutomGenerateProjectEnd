package com.lotusfan.dao;
import com.lotusfan.model.Tdic;
import java.util.List;
public interface TdicMapper{
	public void save(Tdic tdic);
	public void update(Tdic tdic);
	public List<Tdic> getBy(Tdic tdic);
	public Tdic getUniqueBy(Tdic tdic);
	public Integer count(Tdic tdic);
	public List<Tdic> getConditionBy(Tdic tdic);
}