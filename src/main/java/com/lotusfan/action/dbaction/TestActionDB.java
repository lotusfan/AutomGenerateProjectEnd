package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TestMapper;
import com.lotusfan.model.Test;
@Controller
@RequestMapping(value = "/db/test")
public class TestActionDB {
	@Autowired
	private TestMapper testMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody Test test) {
		testMapper.save(test);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody Test test) {
		if(test.getId()==null){
			return;
		}
		testMapper.update(test);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<Test> list = testMapper.getBy(new Test());
		ModelAndView mav = new ModelAndView("/jspdb/Test.jsp");
		mav.addObject("test", list);
		return mav;
	}

}