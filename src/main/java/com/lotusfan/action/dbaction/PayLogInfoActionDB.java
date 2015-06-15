package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.PayLogInfoMapper;
import com.lotusfan.model.PayLogInfo;
@Controller
@RequestMapping(value = "/db/payLogInfo")
public class PayLogInfoActionDB {
	@Autowired
	private PayLogInfoMapper payLogInfoMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody PayLogInfo payLogInfo) {
		payLogInfoMapper.save(payLogInfo);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody PayLogInfo payLogInfo) {
		if(payLogInfo.getId()==null){
			return;
		}
		payLogInfoMapper.update(payLogInfo);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<PayLogInfo> list = payLogInfoMapper.getBy(new PayLogInfo());
		ModelAndView mav = new ModelAndView("/jspdb/PayLogInfo.jsp");
		mav.addObject("payLogInfo", list);
		return mav;
	}

}