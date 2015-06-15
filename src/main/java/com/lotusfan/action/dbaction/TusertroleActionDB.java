package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TusertroleMapper;
import com.lotusfan.model.Tusertrole;
@Controller
@RequestMapping(value = "/db/tusertrole")
public class TusertroleActionDB {
	@Autowired
	private TusertroleMapper tusertroleMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody Tusertrole tusertrole) {
		tusertroleMapper.save(tusertrole);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody Tusertrole tusertrole) {
		if(tusertrole.getCID()==null){
			return;
		}
		tusertroleMapper.update(tusertrole);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<Tusertrole> list = tusertroleMapper.getBy(new Tusertrole());
		ModelAndView mav = new ModelAndView("/jspdb/Tusertrole.jsp");
		mav.addObject("tusertrole", list);
		return mav;
	}

}