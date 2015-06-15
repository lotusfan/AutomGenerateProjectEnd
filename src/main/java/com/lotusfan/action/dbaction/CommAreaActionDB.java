package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CommAreaMapper;
import com.lotusfan.model.CommArea;
@Controller
@RequestMapping(value = "/db/commArea")
public class CommAreaActionDB {
	@Autowired
	private CommAreaMapper commAreaMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CommArea commArea) {
		commAreaMapper.save(commArea);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CommArea commArea) {
		if(commArea.getId()==null){
			return;
		}
		commAreaMapper.update(commArea);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CommArea> list = commAreaMapper.getBy(new CommArea());
		ModelAndView mav = new ModelAndView("/jspdb/CommArea.jsp");
		mav.addObject("commArea", list);
		return mav;
	}

}