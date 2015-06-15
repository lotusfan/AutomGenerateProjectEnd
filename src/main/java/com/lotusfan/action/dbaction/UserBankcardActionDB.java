package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.UserBankcardMapper;
import com.lotusfan.model.UserBankcard;
@Controller
@RequestMapping(value = "/db/userBankcard")
public class UserBankcardActionDB {
	@Autowired
	private UserBankcardMapper userBankcardMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody UserBankcard userBankcard) {
		userBankcardMapper.save(userBankcard);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody UserBankcard userBankcard) {
		if(userBankcard.getId()==null){
			return;
		}
		userBankcardMapper.update(userBankcard);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<UserBankcard> list = userBankcardMapper.getBy(new UserBankcard());
		ModelAndView mav = new ModelAndView("/jspdb/UserBankcard.jsp");
		mav.addObject("userBankcard", list);
		return mav;
	}

}