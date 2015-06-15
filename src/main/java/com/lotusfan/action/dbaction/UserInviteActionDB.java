package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.UserInviteMapper;
import com.lotusfan.model.UserInvite;
@Controller
@RequestMapping(value = "/db/userInvite")
public class UserInviteActionDB {
	@Autowired
	private UserInviteMapper userInviteMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody UserInvite userInvite) {
		userInviteMapper.save(userInvite);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody UserInvite userInvite) {
		if(userInvite.getId()==null){
			return;
		}
		userInviteMapper.update(userInvite);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<UserInvite> list = userInviteMapper.getBy(new UserInvite());
		ModelAndView mav = new ModelAndView("/jspdb/UserInvite.jsp");
		mav.addObject("userInvite", list);
		return mav;
	}

}