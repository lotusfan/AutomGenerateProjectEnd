package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TroleMapper;
import com.lotusfan.model.Trole;
@Controller
@RequestMapping(value = "/db/trole")
public class TroleActionDB {
	@Autowired
	private TroleMapper troleMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody Trole trole) {
		troleMapper.save(trole);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody Trole trole) {
		if(trole.getCID()==null){
			return;
		}
		troleMapper.update(trole);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<Trole> list = troleMapper.getBy(new Trole());
		ModelAndView mav = new ModelAndView("/jspdb/Trole.jsp");
		mav.addObject("trole", list);
		return mav;
	}

}