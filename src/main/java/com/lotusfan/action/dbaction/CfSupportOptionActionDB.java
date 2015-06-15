package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CfSupportOptionMapper;
import com.lotusfan.model.CfSupportOption;
@Controller
@RequestMapping(value = "/db/cfSupportOption")
public class CfSupportOptionActionDB {
	@Autowired
	private CfSupportOptionMapper cfSupportOptionMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CfSupportOption cfSupportOption) {
		cfSupportOptionMapper.save(cfSupportOption);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CfSupportOption cfSupportOption) {
		if(cfSupportOption.getId()==null){
			return;
		}
		cfSupportOptionMapper.update(cfSupportOption);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CfSupportOption> list = cfSupportOptionMapper.getBy(new CfSupportOption());
		ModelAndView mav = new ModelAndView("/jspdb/CfSupportOption.jsp");
		mav.addObject("cfSupportOption", list);
		return mav;
	}

}