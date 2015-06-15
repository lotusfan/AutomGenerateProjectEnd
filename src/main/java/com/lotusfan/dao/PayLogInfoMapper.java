package com.lotusfan.dao;
import com.lotusfan.model.PayLogInfo;
import java.util.List;
public interface PayLogInfoMapper{
	public void save(PayLogInfo payLogInfo);
	public void update(PayLogInfo payLogInfo);
	public List<PayLogInfo> getBy(PayLogInfo payLogInfo);
	public PayLogInfo getUniqueBy(PayLogInfo payLogInfo);
	public Integer count(PayLogInfo payLogInfo);
	public List<PayLogInfo> getConditionBy(PayLogInfo payLogInfo);
}