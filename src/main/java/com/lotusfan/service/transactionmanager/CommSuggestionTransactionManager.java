package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CommSuggestionMapper;
import com.lotusfan.model.CommSuggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommSuggestionTransactionManager {



    @Autowired
    private CommSuggestionMapper commSuggestionMapper;


    public void saveCommSuggestion(CommSuggestion commSuggestion) {

        commSuggestionMapper.save(commSuggestion);
    }

    public void saveCommSuggestions(List<CommSuggestion> commSuggestions) {

        if (commSuggestions == null) {
            return;
        }
        for (int i = 0; i < commSuggestions.size(); i++) {
            commSuggestionMapper.save(commSuggestions.get(i));
        }
    }

    public void updateCommSuggestion(CommSuggestion commSuggestion) {
        commSuggestionMapper.update(commSuggestion);

    }

    public void updateCommSuggestions(List<CommSuggestion> commSuggestions) {
        if (commSuggestions == null) {
            return;
        }
        for (int i = 0; i < commSuggestions.size(); i++) {
            commSuggestionMapper.update(commSuggestions.get(i));
        }
    }

    public CommSuggestion getUniqueBy(CommSuggestion commSuggestion) {

        return commSuggestionMapper.getUniqueBy(commSuggestion);
    }

    public List<CommSuggestion> getBy(CommSuggestion commSuggestion) {

        return commSuggestionMapper.getBy(commSuggestion);
    }

    public Integer count(CommSuggestion commSuggestion) {

        return commSuggestionMapper.count(commSuggestion);
    }

}
