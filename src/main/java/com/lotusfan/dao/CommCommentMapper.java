package com.lotusfan.dao;
import com.lotusfan.model.CommComment;
import java.util.List;
public interface CommCommentMapper{
	public void save(CommComment commComment);
	public void update(CommComment commComment);
	public List<CommComment> getBy(CommComment commComment);
	public CommComment getUniqueBy(CommComment commComment);
	public Integer count(CommComment commComment);
	public List<CommComment> getConditionBy(CommComment commComment);
}