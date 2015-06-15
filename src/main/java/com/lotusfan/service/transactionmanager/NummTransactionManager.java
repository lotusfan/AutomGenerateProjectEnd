package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.NummMapper;
import com.lotusfan.model.Numm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NummTransactionManager {



    @Autowired
    private NummMapper nummMapper;


    public void saveNumm(Numm numm) {

        nummMapper.save(numm);
    }

    public void saveNumms(List<Numm> numms) {

        if (numms == null) {
            return;
        }
        for (int i = 0; i < numms.size(); i++) {
            nummMapper.save(numms.get(i));
        }
    }

    public void updateNumm(Numm numm) {
        nummMapper.update(numm);

    }

    public void updateNumms(List<Numm> numms) {
        if (numms == null) {
            return;
        }
        for (int i = 0; i < numms.size(); i++) {
            nummMapper.update(numms.get(i));
        }
    }

    public Numm getUniqueBy(Numm numm) {

        return nummMapper.getUniqueBy(numm);
    }

    public List<Numm> getBy(Numm numm) {

        return nummMapper.getBy(numm);
    }

    public Integer count(Numm numm) {

        return nummMapper.count(numm);
    }

}
