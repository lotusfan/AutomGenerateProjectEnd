package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TusertroleMapper;
import com.lotusfan.model.Tusertrole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TusertroleTransactionManager {



    @Autowired
    private TusertroleMapper tusertroleMapper;


    public void saveTusertrole(Tusertrole tusertrole) {

        tusertroleMapper.save(tusertrole);
    }

    public void saveTusertroles(List<Tusertrole> tusertroles) {

        if (tusertroles == null) {
            return;
        }
        for (int i = 0; i < tusertroles.size(); i++) {
            tusertroleMapper.save(tusertroles.get(i));
        }
    }

    public void updateTusertrole(Tusertrole tusertrole) {
        tusertroleMapper.update(tusertrole);

    }

    public void updateTusertroles(List<Tusertrole> tusertroles) {
        if (tusertroles == null) {
            return;
        }
        for (int i = 0; i < tusertroles.size(); i++) {
            tusertroleMapper.update(tusertroles.get(i));
        }
    }

    public Tusertrole getUniqueBy(Tusertrole tusertrole) {

        return tusertroleMapper.getUniqueBy(tusertrole);
    }

    public List<Tusertrole> getBy(Tusertrole tusertrole) {

        return tusertroleMapper.getBy(tusertrole);
    }

    public Integer count(Tusertrole tusertrole) {

        return tusertroleMapper.count(tusertrole);
    }

}
