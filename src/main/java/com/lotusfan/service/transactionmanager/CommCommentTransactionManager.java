package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CommCommentMapper;
import com.lotusfan.model.CommComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommCommentTransactionManager {



    @Autowired
    private CommCommentMapper commCommentMapper;


    public void saveCommComment(CommComment commComment) {

        commCommentMapper.save(commComment);
    }

    public void saveCommComments(List<CommComment> commComments) {

        if (commComments == null) {
            return;
        }
        for (int i = 0; i < commComments.size(); i++) {
            commCommentMapper.save(commComments.get(i));
        }
    }

    public void updateCommComment(CommComment commComment) {
        commCommentMapper.update(commComment);

    }

    public void updateCommComments(List<CommComment> commComments) {
        if (commComments == null) {
            return;
        }
        for (int i = 0; i < commComments.size(); i++) {
            commCommentMapper.update(commComments.get(i));
        }
    }

    public CommComment getUniqueBy(CommComment commComment) {

        return commCommentMapper.getUniqueBy(commComment);
    }

    public List<CommComment> getBy(CommComment commComment) {

        return commCommentMapper.getBy(commComment);
    }

    public Integer count(CommComment commComment) {

        return commCommentMapper.count(commComment);
    }

}
