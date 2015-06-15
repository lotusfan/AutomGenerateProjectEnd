package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.UserIncomeMapper;
import com.lotusfan.model.UserIncome;
@Controller
@RequestMapping(value = "/db/userIncome")
public class UserIncomeActionDB {
	@Autowired
	private UserIncomeMapper userIncomeMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody UserIncome userIncome) {
		userIncomeMapper.save(userIncome);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody UserIncome userIncome) {
		if(userIncome.getId()==null){
			return;
		}
		userIncomeMapper.update(userIncome);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<UserIncome> list = userIncomeMapper.getBy(new UserIncome());
		ModelAndView mav = new ModelAndView("/jspdb/UserIncome.jsp");
		mav.addObject("userIncome", list);
		return mav;
	}

}