package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CommCommentMapper;
import com.lotusfan.model.CommComment;
@Controller
@RequestMapping(value = "/db/commComment")
public class CommCommentActionDB {
	@Autowired
	private CommCommentMapper commCommentMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CommComment commComment) {
		commCommentMapper.save(commComment);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CommComment commComment) {
		if(commComment.getId()==null){
			return;
		}
		commCommentMapper.update(commComment);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CommComment> list = commCommentMapper.getBy(new CommComment());
		ModelAndView mav = new ModelAndView("/jspdb/CommComment.jsp");
		mav.addObject("commComment", list);
		return mav;
	}

}