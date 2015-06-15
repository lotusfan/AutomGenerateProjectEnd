package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.UserConsumeMapper;
import com.lotusfan.model.UserConsume;
@Controller
@RequestMapping(value = "/db/userConsume")
public class UserConsumeActionDB {
	@Autowired
	private UserConsumeMapper userConsumeMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody UserConsume userConsume) {
		userConsumeMapper.save(userConsume);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody UserConsume userConsume) {
		if(userConsume.getId()==null){
			return;
		}
		userConsumeMapper.update(userConsume);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<UserConsume> list = userConsumeMapper.getBy(new UserConsume());
		ModelAndView mav = new ModelAndView("/jspdb/UserConsume.jsp");
		mav.addObject("userConsume", list);
		return mav;
	}

}