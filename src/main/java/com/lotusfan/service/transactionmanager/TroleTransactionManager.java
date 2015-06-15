package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TroleMapper;
import com.lotusfan.model.Trole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TroleTransactionManager {



    @Autowired
    private TroleMapper troleMapper;


    public void saveTrole(Trole trole) {

        troleMapper.save(trole);
    }

    public void saveTroles(List<Trole> troles) {

        if (troles == null) {
            return;
        }
        for (int i = 0; i < troles.size(); i++) {
            troleMapper.save(troles.get(i));
        }
    }

    public void updateTrole(Trole trole) {
        troleMapper.update(trole);

    }

    public void updateTroles(List<Trole> troles) {
        if (troles == null) {
            return;
        }
        for (int i = 0; i < troles.size(); i++) {
            troleMapper.update(troles.get(i));
        }
    }

    public Trole getUniqueBy(Trole trole) {

        return troleMapper.getUniqueBy(trole);
    }

    public List<Trole> getBy(Trole trole) {

        return troleMapper.getBy(trole);
    }

    public Integer count(Trole trole) {

        return troleMapper.count(trole);
    }

}
