package com.lotusfan.dao;
import com.lotusfan.model.CfDwTrip;
import java.util.List;
public interface CfDwTripMapper{
	public void save(CfDwTrip cfDwTrip);
	public void update(CfDwTrip cfDwTrip);
	public List<CfDwTrip> getBy(CfDwTrip cfDwTrip);
	public CfDwTrip getUniqueBy(CfDwTrip cfDwTrip);
	public Integer count(CfDwTrip cfDwTrip);
	public List<CfDwTrip> getConditionBy(CfDwTrip cfDwTrip);
}