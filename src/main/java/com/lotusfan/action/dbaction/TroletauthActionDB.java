package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.TroletauthMapper;
import com.lotusfan.model.Troletauth;
@Controller
@RequestMapping(value = "/db/troletauth")
public class TroletauthActionDB {
	@Autowired
	private TroletauthMapper troletauthMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody Troletauth troletauth) {
		troletauthMapper.save(troletauth);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody Troletauth troletauth) {
		if(troletauth.getCID()==null){
			return;
		}
		troletauthMapper.update(troletauth);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<Troletauth> list = troletauthMapper.getBy(new Troletauth());
		ModelAndView mav = new ModelAndView("/jspdb/Troletauth.jsp");
		mav.addObject("troletauth", list);
		return mav;
	}

}