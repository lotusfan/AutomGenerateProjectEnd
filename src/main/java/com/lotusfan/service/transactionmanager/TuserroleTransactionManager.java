package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TuserroleMapper;
import com.lotusfan.model.Tuserrole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuserroleTransactionManager {



    @Autowired
    private TuserroleMapper tuserroleMapper;


    public void saveTuserrole(Tuserrole tuserrole) {

        tuserroleMapper.save(tuserrole);
    }

    public void saveTuserroles(List<Tuserrole> tuserroles) {

        if (tuserroles == null) {
            return;
        }
        for (int i = 0; i < tuserroles.size(); i++) {
            tuserroleMapper.save(tuserroles.get(i));
        }
    }

    public void updateTuserrole(Tuserrole tuserrole) {
        tuserroleMapper.update(tuserrole);

    }

    public void updateTuserroles(List<Tuserrole> tuserroles) {
        if (tuserroles == null) {
            return;
        }
        for (int i = 0; i < tuserroles.size(); i++) {
            tuserroleMapper.update(tuserroles.get(i));
        }
    }

    public Tuserrole getUniqueBy(Tuserrole tuserrole) {

        return tuserroleMapper.getUniqueBy(tuserrole);
    }

    public List<Tuserrole> getBy(Tuserrole tuserrole) {

        return tuserroleMapper.getBy(tuserrole);
    }

    public Integer count(Tuserrole tuserrole) {

        return tuserroleMapper.count(tuserrole);
    }

}
