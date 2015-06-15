package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CfDwProductMapper;
import com.lotusfan.model.CfDwProduct;
@Controller
@RequestMapping(value = "/db/cfDwProduct")
public class CfDwProductActionDB {
	@Autowired
	private CfDwProductMapper cfDwProductMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CfDwProduct cfDwProduct) {
		cfDwProductMapper.save(cfDwProduct);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CfDwProduct cfDwProduct) {
		if(cfDwProduct.getId()==null){
			return;
		}
		cfDwProductMapper.update(cfDwProduct);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CfDwProduct> list = cfDwProductMapper.getBy(new CfDwProduct());
		ModelAndView mav = new ModelAndView("/jspdb/CfDwProduct.jsp");
		mav.addObject("cfDwProduct", list);
		return mav;
	}

}