package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.FtBaseInfoMapper;
import com.lotusfan.model.FtBaseInfo;
@Controller
@RequestMapping(value = "/db/ftBaseInfo")
public class FtBaseInfoActionDB {
	@Autowired
	private FtBaseInfoMapper ftBaseInfoMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody FtBaseInfo ftBaseInfo) {
		ftBaseInfoMapper.save(ftBaseInfo);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody FtBaseInfo ftBaseInfo) {
		if(ftBaseInfo.getId()==null){
			return;
		}
		ftBaseInfoMapper.update(ftBaseInfo);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<FtBaseInfo> list = ftBaseInfoMapper.getBy(new FtBaseInfo());
		ModelAndView mav = new ModelAndView("/jspdb/FtBaseInfo.jsp");
		mav.addObject("ftBaseInfo", list);
		return mav;
	}

}