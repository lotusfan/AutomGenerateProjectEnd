package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TdicMapper;
import com.lotusfan.model.Tdic;
@Controller
@RequestMapping(value = "/db/tdic")
public class TdicActionDB {
	@Autowired
	private TdicMapper tdicMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody Tdic tdic) {
		tdicMapper.save(tdic);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody Tdic tdic) {
		if(tdic.getCID()==null){
			return;
		}
		tdicMapper.update(tdic);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<Tdic> list = tdicMapper.getBy(new Tdic());
		ModelAndView mav = new ModelAndView("/jspdb/Tdic.jsp");
		mav.addObject("tdic", list);
		return mav;
	}

}