package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.DcTripMapper;
import com.lotusfan.model.DcTrip;
@Controller
@RequestMapping(value = "/db/dcTrip")
public class DcTripActionDB {
	@Autowired
	private DcTripMapper dcTripMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody DcTrip dcTrip) {
		dcTripMapper.save(dcTrip);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody DcTrip dcTrip) {
		if(dcTrip.getId()==null){
			return;
		}
		dcTripMapper.update(dcTrip);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<DcTrip> list = dcTripMapper.getBy(new DcTrip());
		ModelAndView mav = new ModelAndView("/jspdb/DcTrip.jsp");
		mav.addObject("dcTrip", list);
		return mav;
	}

}