package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TransLogMapper;
import com.lotusfan.model.TransLog;
@Controller
@RequestMapping(value = "/db/transLog")
public class TransLogActionDB {
	@Autowired
	private TransLogMapper transLogMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody TransLog transLog) {
		transLogMapper.save(transLog);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody TransLog transLog) {
		if(transLog.getId()==null){
			return;
		}
		transLogMapper.update(transLog);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<TransLog> list = transLogMapper.getBy(new TransLog());
		ModelAndView mav = new ModelAndView("/jspdb/TransLog.jsp");
		mav.addObject("transLog", list);
		return mav;
	}

}