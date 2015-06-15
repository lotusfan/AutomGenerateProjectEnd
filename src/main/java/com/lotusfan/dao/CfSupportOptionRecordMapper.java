package com.lotusfan.dao;
import com.lotusfan.model.CfSupportOptionRecord;
import java.util.List;
public interface CfSupportOptionRecordMapper{
	public void save(CfSupportOptionRecord cfSupportOptionRecord);
	public void update(CfSupportOptionRecord cfSupportOptionRecord);
	public List<CfSupportOptionRecord> getBy(CfSupportOptionRecord cfSupportOptionRecord);
	public CfSupportOptionRecord getUniqueBy(CfSupportOptionRecord cfSupportOptionRecord);
	public Integer count(CfSupportOptionRecord cfSupportOptionRecord);
	public List<CfSupportOptionRecord> getConditionBy(CfSupportOptionRecord cfSupportOptionRecord);
}