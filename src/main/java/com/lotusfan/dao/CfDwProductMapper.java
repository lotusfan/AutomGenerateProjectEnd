package com.lotusfan.dao;
import com.lotusfan.model.CfDwProduct;
import java.util.List;
public interface CfDwProductMapper{
	public void save(CfDwProduct cfDwProduct);
	public void update(CfDwProduct cfDwProduct);
	public List<CfDwProduct> getBy(CfDwProduct cfDwProduct);
	public CfDwProduct getUniqueBy(CfDwProduct cfDwProduct);
	public Integer count(CfDwProduct cfDwProduct);
	public List<CfDwProduct> getConditionBy(CfDwProduct cfDwProduct);
}