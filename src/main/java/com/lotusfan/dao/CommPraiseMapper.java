package com.lotusfan.dao;
import com.lotusfan.model.CommPraise;
import java.util.List;
public interface CommPraiseMapper{
	public void save(CommPraise commPraise);
	public void update(CommPraise commPraise);
	public List<CommPraise> getBy(CommPraise commPraise);
	public CommPraise getUniqueBy(CommPraise commPraise);
	public Integer count(CommPraise commPraise);
	public List<CommPraise> getConditionBy(CommPraise commPraise);
}