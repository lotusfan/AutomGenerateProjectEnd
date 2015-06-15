package com.lotusfan.dao;
import com.lotusfan.model.Troletauth;
import java.util.List;
public interface TroletauthMapper{
	public void save(Troletauth troletauth);
	public void update(Troletauth troletauth);
	public List<Troletauth> getBy(Troletauth troletauth);
	public Troletauth getUniqueBy(Troletauth troletauth);
	public Integer count(Troletauth troletauth);
	public List<Troletauth> getConditionBy(Troletauth troletauth);
}