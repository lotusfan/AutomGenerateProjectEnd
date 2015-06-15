package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TuserroleMapper;
import com.lotusfan.model.Tuserrole;
@Controller
@RequestMapping(value = "/db/tuserrole")
public class TuserroleActionDB {
	@Autowired
	private TuserroleMapper tuserroleMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody Tuserrole tuserrole) {
		tuserroleMapper.save(tuserrole);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody Tuserrole tuserrole) {
		if(tuserrole.getCID()==null){
			return;
		}
		tuserroleMapper.update(tuserrole);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<Tuserrole> list = tuserroleMapper.getBy(new Tuserrole());
		ModelAndView mav = new ModelAndView("/jspdb/Tuserrole.jsp");
		mav.addObject("tuserrole", list);
		return mav;
	}

}