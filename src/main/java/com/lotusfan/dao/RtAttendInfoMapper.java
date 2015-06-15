package com.lotusfan.dao;
import com.lotusfan.model.RtAttendInfo;
import java.util.List;
public interface RtAttendInfoMapper{
	public void save(RtAttendInfo rtAttendInfo);
	public void update(RtAttendInfo rtAttendInfo);
	public List<RtAttendInfo> getBy(RtAttendInfo rtAttendInfo);
	public RtAttendInfo getUniqueBy(RtAttendInfo rtAttendInfo);
	public Integer count(RtAttendInfo rtAttendInfo);
	public List<RtAttendInfo> getConditionBy(RtAttendInfo rtAttendInfo);
}