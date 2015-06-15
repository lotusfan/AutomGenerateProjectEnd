package com.lotusfan.dao;
import com.lotusfan.model.DcRegInfo;
import java.util.List;
public interface DcRegInfoMapper{
	public void save(DcRegInfo dcRegInfo);
	public void update(DcRegInfo dcRegInfo);
	public List<DcRegInfo> getBy(DcRegInfo dcRegInfo);
	public DcRegInfo getUniqueBy(DcRegInfo dcRegInfo);
	public Integer count(DcRegInfo dcRegInfo);
	public List<DcRegInfo> getConditionBy(DcRegInfo dcRegInfo);
}