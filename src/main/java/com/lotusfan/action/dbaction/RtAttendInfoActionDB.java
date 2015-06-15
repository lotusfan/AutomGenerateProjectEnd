package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.RtAttendInfoMapper;
import com.lotusfan.model.RtAttendInfo;
@Controller
@RequestMapping(value = "/db/rtAttendInfo")
public class RtAttendInfoActionDB {
	@Autowired
	private RtAttendInfoMapper rtAttendInfoMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody RtAttendInfo rtAttendInfo) {
		rtAttendInfoMapper.save(rtAttendInfo);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody RtAttendInfo rtAttendInfo) {
		if(rtAttendInfo.getId()==null){
			return;
		}
		rtAttendInfoMapper.update(rtAttendInfo);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<RtAttendInfo> list = rtAttendInfoMapper.getBy(new RtAttendInfo());
		ModelAndView mav = new ModelAndView("/jspdb/RtAttendInfo.jsp");
		mav.addObject("rtAttendInfo", list);
		return mav;
	}

}