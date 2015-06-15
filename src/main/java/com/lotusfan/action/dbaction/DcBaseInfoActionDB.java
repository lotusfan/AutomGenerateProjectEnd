package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.DcBaseInfoMapper;
import com.lotusfan.model.DcBaseInfo;
@Controller
@RequestMapping(value = "/db/dcBaseInfo")
public class DcBaseInfoActionDB {
	@Autowired
	private DcBaseInfoMapper dcBaseInfoMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody DcBaseInfo dcBaseInfo) {
		dcBaseInfoMapper.save(dcBaseInfo);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody DcBaseInfo dcBaseInfo) {
		if(dcBaseInfo.getId()==null){
			return;
		}
		dcBaseInfoMapper.update(dcBaseInfo);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<DcBaseInfo> list = dcBaseInfoMapper.getBy(new DcBaseInfo());
		ModelAndView mav = new ModelAndView("/jspdb/DcBaseInfo.jsp");
		mav.addObject("dcBaseInfo", list);
		return mav;
	}

}