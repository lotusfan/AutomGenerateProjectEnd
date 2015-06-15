package com.lotusfan.dao;
import com.lotusfan.model.DcBaseInfo;
import java.util.List;
public interface DcBaseInfoMapper{
	public void save(DcBaseInfo dcBaseInfo);
	public void update(DcBaseInfo dcBaseInfo);
	public List<DcBaseInfo> getBy(DcBaseInfo dcBaseInfo);
	public DcBaseInfo getUniqueBy(DcBaseInfo dcBaseInfo);
	public Integer count(DcBaseInfo dcBaseInfo);
	public List<DcBaseInfo> getConditionBy(DcBaseInfo dcBaseInfo);
}