package com.lotusfan.dao;
import com.lotusfan.model.CommSuggestion;
import java.util.List;
public interface CommSuggestionMapper{
	public void save(CommSuggestion commSuggestion);
	public void update(CommSuggestion commSuggestion);
	public List<CommSuggestion> getBy(CommSuggestion commSuggestion);
	public CommSuggestion getUniqueBy(CommSuggestion commSuggestion);
	public Integer count(CommSuggestion commSuggestion);
	public List<CommSuggestion> getConditionBy(CommSuggestion commSuggestion);
}