package com.lotusfan.dao;
import com.lotusfan.model.Test;
import java.util.List;
public interface TestMapper{
	public void save(Test test);
	public void update(Test test);
	public List<Test> getBy(Test test);
	public Test getUniqueBy(Test test);
	public Integer count(Test test);
	public List<Test> getConditionBy(Test test);
}