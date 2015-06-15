package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TauthMapper;
import com.lotusfan.model.Tauth;
@Controller
@RequestMapping(value = "/db/tauth")
public class TauthActionDB {
	@Autowired
	private TauthMapper tauthMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody Tauth tauth) {
		tauthMapper.save(tauth);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody Tauth tauth) {
		if(tauth.getCID()==null){
			return;
		}
		tauthMapper.update(tauth);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<Tauth> list = tauthMapper.getBy(new Tauth());
		ModelAndView mav = new ModelAndView("/jspdb/Tauth.jsp");
		mav.addObject("tauth", list);
		return mav;
	}

}