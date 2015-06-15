package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TransInfoMapper;
import com.lotusfan.model.TransInfo;
@Controller
@RequestMapping(value = "/db/transInfo")
public class TransInfoActionDB {
	@Autowired
	private TransInfoMapper transInfoMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody TransInfo transInfo) {
		transInfoMapper.save(transInfo);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody TransInfo transInfo) {
		if(transInfo.getId()==null){
			return;
		}
		transInfoMapper.update(transInfo);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<TransInfo> list = transInfoMapper.getBy(new TransInfo());
		ModelAndView mav = new ModelAndView("/jspdb/TransInfo.jsp");
		mav.addObject("transInfo", list);
		return mav;
	}

}