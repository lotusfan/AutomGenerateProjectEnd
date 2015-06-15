package com.lotusfan.dao;
import com.lotusfan.model.CfProduct;
import java.util.List;
public interface CfProductMapper{
	public void save(CfProduct cfProduct);
	public void update(CfProduct cfProduct);
	public List<CfProduct> getBy(CfProduct cfProduct);
	public CfProduct getUniqueBy(CfProduct cfProduct);
	public Integer count(CfProduct cfProduct);
	public List<CfProduct> getConditionBy(CfProduct cfProduct);
}