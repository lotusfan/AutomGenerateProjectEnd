package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TdeptMapper;
import com.lotusfan.model.Tdept;
@Controller
@RequestMapping(value = "/db/tdept")
public class TdeptActionDB {
	@Autowired
	private TdeptMapper tdeptMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody Tdept tdept) {
		tdeptMapper.save(tdept);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody Tdept tdept) {
		if(tdept.getCID()==null){
			return;
		}
		tdeptMapper.update(tdept);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<Tdept> list = tdeptMapper.getBy(new Tdept());
		ModelAndView mav = new ModelAndView("/jspdb/Tdept.jsp");
		mav.addObject("tdept", list);
		return mav;
	}

}