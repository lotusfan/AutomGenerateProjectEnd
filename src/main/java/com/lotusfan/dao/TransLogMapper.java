package com.lotusfan.dao;
import com.lotusfan.model.TransLog;
import java.util.List;
public interface TransLogMapper{
	public void save(TransLog transLog);
	public void update(TransLog transLog);
	public List<TransLog> getBy(TransLog transLog);
	public TransLog getUniqueBy(TransLog transLog);
	public Integer count(TransLog transLog);
	public List<TransLog> getConditionBy(TransLog transLog);
}