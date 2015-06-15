package com.lotusfan.dao;
import com.lotusfan.model.DcTrip;
import java.util.List;
public interface DcTripMapper{
	public void save(DcTrip dcTrip);
	public void update(DcTrip dcTrip);
	public List<DcTrip> getBy(DcTrip dcTrip);
	public DcTrip getUniqueBy(DcTrip dcTrip);
	public Integer count(DcTrip dcTrip);
	public List<DcTrip> getConditionBy(DcTrip dcTrip);
}