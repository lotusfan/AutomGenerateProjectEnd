package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TdicMapper;
import com.lotusfan.model.Tdic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TdicTransactionManager {



    @Autowired
    private TdicMapper tdicMapper;


    public void saveTdic(Tdic tdic) {

        tdicMapper.save(tdic);
    }

    public void saveTdics(List<Tdic> tdics) {

        if (tdics == null) {
            return;
        }
        for (int i = 0; i < tdics.size(); i++) {
            tdicMapper.save(tdics.get(i));
        }
    }

    public void updateTdic(Tdic tdic) {
        tdicMapper.update(tdic);

    }

    public void updateTdics(List<Tdic> tdics) {
        if (tdics == null) {
            return;
        }
        for (int i = 0; i < tdics.size(); i++) {
            tdicMapper.update(tdics.get(i));
        }
    }

    public Tdic getUniqueBy(Tdic tdic) {

        return tdicMapper.getUniqueBy(tdic);
    }

    public List<Tdic> getBy(Tdic tdic) {

        return tdicMapper.getBy(tdic);
    }

    public Integer count(Tdic tdic) {

        return tdicMapper.count(tdic);
    }

}
