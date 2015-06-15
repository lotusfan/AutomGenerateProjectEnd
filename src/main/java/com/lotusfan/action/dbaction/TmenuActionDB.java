package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TmenuMapper;
import com.lotusfan.model.Tmenu;
@Controller
@RequestMapping(value = "/db/tmenu")
public class TmenuActionDB {
	@Autowired
	private TmenuMapper tmenuMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody Tmenu tmenu) {
		tmenuMapper.save(tmenu);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody Tmenu tmenu) {
		if(tmenu.getCID()==null){
			return;
		}
		tmenuMapper.update(tmenu);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<Tmenu> list = tmenuMapper.getBy(new Tmenu());
		ModelAndView mav = new ModelAndView("/jspdb/Tmenu.jsp");
		mav.addObject("tmenu", list);
		return mav;
	}

}