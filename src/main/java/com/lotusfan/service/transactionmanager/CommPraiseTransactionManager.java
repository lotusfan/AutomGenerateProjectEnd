package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CommPraiseMapper;
import com.lotusfan.model.CommPraise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommPraiseTransactionManager {



    @Autowired
    private CommPraiseMapper commPraiseMapper;


    public void saveCommPraise(CommPraise commPraise) {

        commPraiseMapper.save(commPraise);
    }

    public void saveCommPraises(List<CommPraise> commPraises) {

        if (commPraises == null) {
            return;
        }
        for (int i = 0; i < commPraises.size(); i++) {
            commPraiseMapper.save(commPraises.get(i));
        }
    }

    public void updateCommPraise(CommPraise commPraise) {
        commPraiseMapper.update(commPraise);

    }

    public void updateCommPraises(List<CommPraise> commPraises) {
        if (commPraises == null) {
            return;
        }
        for (int i = 0; i < commPraises.size(); i++) {
            commPraiseMapper.update(commPraises.get(i));
        }
    }

    public CommPraise getUniqueBy(CommPraise commPraise) {

        return commPraiseMapper.getUniqueBy(commPraise);
    }

    public List<CommPraise> getBy(CommPraise commPraise) {

        return commPraiseMapper.getBy(commPraise);
    }

    public Integer count(CommPraise commPraise) {

        return commPraiseMapper.count(commPraise);
    }

}
