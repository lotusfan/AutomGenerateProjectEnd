package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CfSupportOptionRecordMapper;
import com.lotusfan.model.CfSupportOptionRecord;
@Controller
@RequestMapping(value = "/db/cfSupportOptionRecord")
public class CfSupportOptionRecordActionDB {
	@Autowired
	private CfSupportOptionRecordMapper cfSupportOptionRecordMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CfSupportOptionRecord cfSupportOptionRecord) {
		cfSupportOptionRecordMapper.save(cfSupportOptionRecord);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CfSupportOptionRecord cfSupportOptionRecord) {
		if(cfSupportOptionRecord.getId()==null){
			return;
		}
		cfSupportOptionRecordMapper.update(cfSupportOptionRecord);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CfSupportOptionRecord> list = cfSupportOptionRecordMapper.getBy(new CfSupportOptionRecord());
		ModelAndView mav = new ModelAndView("/jspdb/CfSupportOptionRecord.jsp");
		mav.addObject("cfSupportOptionRecord", list);
		return mav;
	}

}