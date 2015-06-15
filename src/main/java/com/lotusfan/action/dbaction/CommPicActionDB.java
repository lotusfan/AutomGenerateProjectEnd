package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CommPicMapper;
import com.lotusfan.model.CommPic;
@Controller
@RequestMapping(value = "/db/commPic")
public class CommPicActionDB {
	@Autowired
	private CommPicMapper commPicMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CommPic commPic) {
		commPicMapper.save(commPic);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CommPic commPic) {
		if(commPic.getId()==null){
			return;
		}
		commPicMapper.update(commPic);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CommPic> list = commPicMapper.getBy(new CommPic());
		ModelAndView mav = new ModelAndView("/jspdb/CommPic.jsp");
		mav.addObject("commPic", list);
		return mav;
	}

}