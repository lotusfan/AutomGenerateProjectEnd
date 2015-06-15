package com.lotusfan.dao;
import com.lotusfan.model.Tmenu;
import java.util.List;
public interface TmenuMapper{
	public void save(Tmenu tmenu);
	public void update(Tmenu tmenu);
	public List<Tmenu> getBy(Tmenu tmenu);
	public Tmenu getUniqueBy(Tmenu tmenu);
	public Integer count(Tmenu tmenu);
	public List<Tmenu> getConditionBy(Tmenu tmenu);
}