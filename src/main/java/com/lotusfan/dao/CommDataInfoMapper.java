package com.lotusfan.dao;
import com.lotusfan.model.CommDataInfo;
import java.util.List;
public interface CommDataInfoMapper{
	public void save(CommDataInfo commDataInfo);
	public void update(CommDataInfo commDataInfo);
	public List<CommDataInfo> getBy(CommDataInfo commDataInfo);
	public CommDataInfo getUniqueBy(CommDataInfo commDataInfo);
	public Integer count(CommDataInfo commDataInfo);
	public List<CommDataInfo> getConditionBy(CommDataInfo commDataInfo);
}