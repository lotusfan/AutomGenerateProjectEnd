package com.lotusfan.dao;
import com.lotusfan.model.RtBaseinfo;
import java.util.List;
public interface RtBaseinfoMapper{
	public void save(RtBaseinfo rtBaseinfo);
	public void update(RtBaseinfo rtBaseinfo);
	public List<RtBaseinfo> getBy(RtBaseinfo rtBaseinfo);
	public RtBaseinfo getUniqueBy(RtBaseinfo rtBaseinfo);
	public Integer count(RtBaseinfo rtBaseinfo);
	public List<RtBaseinfo> getConditionBy(RtBaseinfo rtBaseinfo);
}