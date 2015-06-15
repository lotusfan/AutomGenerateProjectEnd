package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.MyTicketHelpMapper;
import com.lotusfan.model.MyTicketHelp;
@Controller
@RequestMapping(value = "/db/myTicketHelp")
public class MyTicketHelpActionDB {
	@Autowired
	private MyTicketHelpMapper myTicketHelpMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody MyTicketHelp myTicketHelp) {
		myTicketHelpMapper.save(myTicketHelp);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody MyTicketHelp myTicketHelp) {
		if(myTicketHelp.getId()==null){
			return;
		}
		myTicketHelpMapper.update(myTicketHelp);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<MyTicketHelp> list = myTicketHelpMapper.getBy(new MyTicketHelp());
		ModelAndView mav = new ModelAndView("/jspdb/MyTicketHelp.jsp");
		mav.addObject("myTicketHelp", list);
		return mav;
	}

}