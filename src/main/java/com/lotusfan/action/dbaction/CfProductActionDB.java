package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CfProductMapper;
import com.lotusfan.model.CfProduct;
@Controller
@RequestMapping(value = "/db/cfProduct")
public class CfProductActionDB {
	@Autowired
	private CfProductMapper cfProductMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CfProduct cfProduct) {
		cfProductMapper.save(cfProduct);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CfProduct cfProduct) {
		if(cfProduct.getId()==null){
			return;
		}
		cfProductMapper.update(cfProduct);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CfProduct> list = cfProductMapper.getBy(new CfProduct());
		ModelAndView mav = new ModelAndView("/jspdb/CfProduct.jsp");
		mav.addObject("cfProduct", list);
		return mav;
	}

}