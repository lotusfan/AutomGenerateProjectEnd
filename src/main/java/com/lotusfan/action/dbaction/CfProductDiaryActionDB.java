package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CfProductDiaryMapper;
import com.lotusfan.model.CfProductDiary;
@Controller
@RequestMapping(value = "/db/cfProductDiary")
public class CfProductDiaryActionDB {
	@Autowired
	private CfProductDiaryMapper cfProductDiaryMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CfProductDiary cfProductDiary) {
		cfProductDiaryMapper.save(cfProductDiary);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CfProductDiary cfProductDiary) {
		if(cfProductDiary.getId()==null){
			return;
		}
		cfProductDiaryMapper.update(cfProductDiary);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CfProductDiary> list = cfProductDiaryMapper.getBy(new CfProductDiary());
		ModelAndView mav = new ModelAndView("/jspdb/CfProductDiary.jsp");
		mav.addObject("cfProductDiary", list);
		return mav;
	}

}