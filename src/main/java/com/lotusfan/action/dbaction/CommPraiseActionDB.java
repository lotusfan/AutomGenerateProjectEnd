package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CommPraiseMapper;
import com.lotusfan.model.CommPraise;
@Controller
@RequestMapping(value = "/db/commPraise")
public class CommPraiseActionDB {
	@Autowired
	private CommPraiseMapper commPraiseMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CommPraise commPraise) {
		commPraiseMapper.save(commPraise);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CommPraise commPraise) {
		if(commPraise.getId()==null){
			return;
		}
		commPraiseMapper.update(commPraise);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CommPraise> list = commPraiseMapper.getBy(new CommPraise());
		ModelAndView mav = new ModelAndView("/jspdb/CommPraise.jsp");
		mav.addObject("commPraise", list);
		return mav;
	}

}