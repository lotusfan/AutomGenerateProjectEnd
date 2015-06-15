package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.DcRegInfoMapper;
import com.lotusfan.model.DcRegInfo;
@Controller
@RequestMapping(value = "/db/dcRegInfo")
public class DcRegInfoActionDB {
	@Autowired
	private DcRegInfoMapper dcRegInfoMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody DcRegInfo dcRegInfo) {
		dcRegInfoMapper.save(dcRegInfo);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody DcRegInfo dcRegInfo) {
		if(dcRegInfo.getId()==null){
			return;
		}
		dcRegInfoMapper.update(dcRegInfo);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<DcRegInfo> list = dcRegInfoMapper.getBy(new DcRegInfo());
		ModelAndView mav = new ModelAndView("/jspdb/DcRegInfo.jsp");
		mav.addObject("dcRegInfo", list);
		return mav;
	}

}