package com.lotusfan.dao;
import com.lotusfan.model.CfProductDiary;
import java.util.List;
public interface CfProductDiaryMapper{
	public void save(CfProductDiary cfProductDiary);
	public void update(CfProductDiary cfProductDiary);
	public List<CfProductDiary> getBy(CfProductDiary cfProductDiary);
	public CfProductDiary getUniqueBy(CfProductDiary cfProductDiary);
	public Integer count(CfProductDiary cfProductDiary);
	public List<CfProductDiary> getConditionBy(CfProductDiary cfProductDiary);
}