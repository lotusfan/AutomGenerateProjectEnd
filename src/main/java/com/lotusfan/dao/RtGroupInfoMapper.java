package com.lotusfan.dao;
import com.lotusfan.model.RtGroupInfo;
import java.util.List;
public interface RtGroupInfoMapper{
	public void save(RtGroupInfo rtGroupInfo);
	public void update(RtGroupInfo rtGroupInfo);
	public List<RtGroupInfo> getBy(RtGroupInfo rtGroupInfo);
	public RtGroupInfo getUniqueBy(RtGroupInfo rtGroupInfo);
	public Integer count(RtGroupInfo rtGroupInfo);
	public List<RtGroupInfo> getConditionBy(RtGroupInfo rtGroupInfo);
}