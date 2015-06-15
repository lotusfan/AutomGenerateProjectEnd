package com.lotusfan.dao;
import com.lotusfan.model.FtBaseInfo;
import java.util.List;
public interface FtBaseInfoMapper{
	public void save(FtBaseInfo ftBaseInfo);
	public void update(FtBaseInfo ftBaseInfo);
	public List<FtBaseInfo> getBy(FtBaseInfo ftBaseInfo);
	public FtBaseInfo getUniqueBy(FtBaseInfo ftBaseInfo);
	public Integer count(FtBaseInfo ftBaseInfo);
	public List<FtBaseInfo> getConditionBy(FtBaseInfo ftBaseInfo);
}