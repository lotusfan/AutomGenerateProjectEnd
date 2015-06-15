package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.NummMapper;
import com.lotusfan.model.Numm;
@Controller
@RequestMapping(value = "/db/numm")
public class NummActionDB {
	@Autowired
	private NummMapper nummMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody Numm numm) {
		nummMapper.save(numm);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody Numm numm) {
		if(numm.getId()==null){
			return;
		}
		nummMapper.update(numm);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<Numm> list = nummMapper.getBy(new Numm());
		ModelAndView mav = new ModelAndView("/jspdb/Numm.jsp");
		mav.addObject("numm", list);
		return mav;
	}

}