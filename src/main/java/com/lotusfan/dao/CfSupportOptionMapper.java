package com.lotusfan.dao;
import com.lotusfan.model.CfSupportOption;
import java.util.List;
public interface CfSupportOptionMapper{
	public void save(CfSupportOption cfSupportOption);
	public void update(CfSupportOption cfSupportOption);
	public List<CfSupportOption> getBy(CfSupportOption cfSupportOption);
	public CfSupportOption getUniqueBy(CfSupportOption cfSupportOption);
	public Integer count(CfSupportOption cfSupportOption);
	public List<CfSupportOption> getConditionBy(CfSupportOption cfSupportOption);
}