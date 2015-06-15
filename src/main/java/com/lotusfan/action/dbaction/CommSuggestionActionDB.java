package com.lotusfan.action.dbaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.lotusfan.dao.CommSuggestionMapper;
import com.lotusfan.model.CommSuggestion;
@Controller
@RequestMapping(value = "/db/commSuggestion")
public class CommSuggestionActionDB {
	@Autowired
	private CommSuggestionMapper commSuggestionMapper;
	@RequestMapping(value = "save", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void savem (@RequestBody CommSuggestion commSuggestion) {
		commSuggestionMapper.save(commSuggestion);
	}
	@RequestMapping(value = "update", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void updatem (@RequestBody CommSuggestion commSuggestion) {
		if(commSuggestion.getId()==null){
			return;
		}
		commSuggestionMapper.update(commSuggestion);
	}
	@RequestMapping(value = "getBy", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public ModelAndView getBym () {
		List<CommSuggestion> list = commSuggestionMapper.getBy(new CommSuggestion());
		ModelAndView mav = new ModelAndView("/jspdb/CommSuggestion.jsp");
		mav.addObject("commSuggestion", list);
		return mav;
	}

}