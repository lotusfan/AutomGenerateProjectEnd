package com.lotusfan.dao;
import com.lotusfan.model.MyTicketHelp;
import java.util.List;
public interface MyTicketHelpMapper{
	public void save(MyTicketHelp myTicketHelp);
	public void update(MyTicketHelp myTicketHelp);
	public List<MyTicketHelp> getBy(MyTicketHelp myTicketHelp);
	public MyTicketHelp getUniqueBy(MyTicketHelp myTicketHelp);
	public Integer count(MyTicketHelp myTicketHelp);
	public List<MyTicketHelp> getConditionBy(MyTicketHelp myTicketHelp);
}