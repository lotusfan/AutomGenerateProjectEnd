package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TuserMapper;
import com.lotusfan.model.Tuser;
@Controller
@RequestMapping(value = "/db/tuser")
public class TuserActionDB {
	@Autowired
	private TuserMapper tuserMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody Tuser tuser) {
		tuserMapper.save(tuser);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody Tuser tuser) {
		if(tuser.getCID()==null){
			return;
		}
		tuserMapper.update(tuser);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<Tuser> list = tuserMapper.getBy(new Tuser());
		ModelAndView mav = new ModelAndView("/jspdb/Tuser.jsp");
		mav.addObject("tuser", list);
		return mav;
	}

}