package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TuserMapper;
import com.lotusfan.model.Tuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuserTransactionManager {



    @Autowired
    private TuserMapper tuserMapper;


    public void saveTuser(Tuser tuser) {

        tuserMapper.save(tuser);
    }

    public void saveTusers(List<Tuser> tusers) {

        if (tusers == null) {
            return;
        }
        for (int i = 0; i < tusers.size(); i++) {
            tuserMapper.save(tusers.get(i));
        }
    }

    public void updateTuser(Tuser tuser) {
        tuserMapper.update(tuser);

    }

    public void updateTusers(List<Tuser> tusers) {
        if (tusers == null) {
            return;
        }
        for (int i = 0; i < tusers.size(); i++) {
            tuserMapper.update(tusers.get(i));
        }
    }

    public Tuser getUniqueBy(Tuser tuser) {

        return tuserMapper.getUniqueBy(tuser);
    }

    public List<Tuser> getBy(Tuser tuser) {

        return tuserMapper.getBy(tuser);
    }

    public Integer count(Tuser tuser) {

        return tuserMapper.count(tuser);
    }

}
