package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CfDwTripMapper;
import com.lotusfan.model.CfDwTrip;
@Controller
@RequestMapping(value = "/db/cfDwTrip")
public class CfDwTripActionDB {
	@Autowired
	private CfDwTripMapper cfDwTripMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CfDwTrip cfDwTrip) {
		cfDwTripMapper.save(cfDwTrip);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CfDwTrip cfDwTrip) {
		if(cfDwTrip.getId()==null){
			return;
		}
		cfDwTripMapper.update(cfDwTrip);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CfDwTrip> list = cfDwTripMapper.getBy(new CfDwTrip());
		ModelAndView mav = new ModelAndView("/jspdb/CfDwTrip.jsp");
		mav.addObject("cfDwTrip", list);
		return mav;
	}

}