package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.UserBaseinfoMapper;
import com.lotusfan.model.UserBaseinfo;
@Controller
@RequestMapping(value = "/db/userBaseinfo")
public class UserBaseinfoActionDB {
	@Autowired
	private UserBaseinfoMapper userBaseinfoMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody UserBaseinfo userBaseinfo) {
		userBaseinfoMapper.save(userBaseinfo);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody UserBaseinfo userBaseinfo) {
		if(userBaseinfo.getUserId()==null){
			return;
		}
		userBaseinfoMapper.update(userBaseinfo);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<UserBaseinfo> list = userBaseinfoMapper.getBy(new UserBaseinfo());
		ModelAndView mav = new ModelAndView("/jspdb/UserBaseinfo.jsp");
		mav.addObject("userBaseinfo", list);
		return mav;
	}

}