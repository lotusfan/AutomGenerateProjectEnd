package com.lotusfan.dao;
import com.lotusfan.model.CommPic;
import java.util.List;
public interface CommPicMapper{
	public void save(CommPic commPic);
	public void update(CommPic commPic);
	public List<CommPic> getBy(CommPic commPic);
	public CommPic getUniqueBy(CommPic commPic);
	public Integer count(CommPic commPic);
	public List<CommPic> getConditionBy(CommPic commPic);
}