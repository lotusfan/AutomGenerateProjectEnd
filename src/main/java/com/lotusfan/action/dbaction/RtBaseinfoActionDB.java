package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.RtBaseinfoMapper;
import com.lotusfan.model.RtBaseinfo;
@Controller
@RequestMapping(value = "/db/rtBaseinfo")
public class RtBaseinfoActionDB {
	@Autowired
	private RtBaseinfoMapper rtBaseinfoMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody RtBaseinfo rtBaseinfo) {
		rtBaseinfoMapper.save(rtBaseinfo);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody RtBaseinfo rtBaseinfo) {
		if(rtBaseinfo.getId()==null){
			return;
		}
		rtBaseinfoMapper.update(rtBaseinfo);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<RtBaseinfo> list = rtBaseinfoMapper.getBy(new RtBaseinfo());
		ModelAndView mav = new ModelAndView("/jspdb/RtBaseinfo.jsp");
		mav.addObject("rtBaseinfo", list);
		return mav;
	}

}