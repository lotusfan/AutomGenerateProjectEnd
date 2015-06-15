package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CommVersionControllerMapper;
import com.lotusfan.model.CommVersionController;
@Controller
@RequestMapping(value = "/db/commVersionController")
public class CommVersionControllerActionDB {
	@Autowired
	private CommVersionControllerMapper commVersionControllerMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CommVersionController commVersionController) {
		commVersionControllerMapper.save(commVersionController);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CommVersionController commVersionController) {
		if(commVersionController.getId()==null){
			return;
		}
		commVersionControllerMapper.update(commVersionController);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CommVersionController> list = commVersionControllerMapper.getBy(new CommVersionController());
		ModelAndView mav = new ModelAndView("/jspdb/CommVersionController.jsp");
		mav.addObject("commVersionController", list);
		return mav;
	}

}