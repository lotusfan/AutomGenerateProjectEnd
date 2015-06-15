package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CommDataInfoMapper;
import com.lotusfan.model.CommDataInfo;
@Controller
@RequestMapping(value = "/db/commDataInfo")
public class CommDataInfoActionDB {
	@Autowired
	private CommDataInfoMapper commDataInfoMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CommDataInfo commDataInfo) {
		commDataInfoMapper.save(commDataInfo);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CommDataInfo commDataInfo) {
		if(commDataInfo.getId()==null){
			return;
		}
		commDataInfoMapper.update(commDataInfo);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CommDataInfo> list = commDataInfoMapper.getBy(new CommDataInfo());
		ModelAndView mav = new ModelAndView("/jspdb/CommDataInfo.jsp");
		mav.addObject("commDataInfo", list);
		return mav;
	}

}