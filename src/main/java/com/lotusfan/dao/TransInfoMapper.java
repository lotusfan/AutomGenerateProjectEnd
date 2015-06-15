package com.lotusfan.dao;
import com.lotusfan.model.TransInfo;
import java.util.List;
public interface TransInfoMapper{
	public void save(TransInfo transInfo);
	public void update(TransInfo transInfo);
	public List<TransInfo> getBy(TransInfo transInfo);
	public TransInfo getUniqueBy(TransInfo transInfo);
	public Integer count(TransInfo transInfo);
	public List<TransInfo> getConditionBy(TransInfo transInfo);
}