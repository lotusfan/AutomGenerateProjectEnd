package com.lotusfan.dao;
import com.lotusfan.model.CommVersionController;
import java.util.List;
public interface CommVersionControllerMapper{
	public void save(CommVersionController commVersionController);
	public void update(CommVersionController commVersionController);
	public List<CommVersionController> getBy(CommVersionController commVersionController);
	public CommVersionController getUniqueBy(CommVersionController commVersionController);
	public Integer count(CommVersionController commVersionController);
	public List<CommVersionController> getConditionBy(CommVersionController commVersionController);
}