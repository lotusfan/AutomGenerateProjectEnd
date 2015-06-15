package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.RtGroupInfoMapper;
import com.lotusfan.model.RtGroupInfo;
@Controller
@RequestMapping(value = "/db/rtGroupInfo")
public class RtGroupInfoActionDB {
	@Autowired
	private RtGroupInfoMapper rtGroupInfoMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody RtGroupInfo rtGroupInfo) {
		rtGroupInfoMapper.save(rtGroupInfo);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody RtGroupInfo rtGroupInfo) {
		if(rtGroupInfo.getId()==null){
			return;
		}
		rtGroupInfoMapper.update(rtGroupInfo);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<RtGroupInfo> list = rtGroupInfoMapper.getBy(new RtGroupInfo());
		ModelAndView mav = new ModelAndView("/jspdb/RtGroupInfo.jsp");
		mav.addObject("rtGroupInfo", list);
		return mav;
	}

}