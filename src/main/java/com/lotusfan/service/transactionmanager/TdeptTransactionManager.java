package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TdeptMapper;
import com.lotusfan.model.Tdept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TdeptTransactionManager {



    @Autowired
    private TdeptMapper tdeptMapper;


    public void saveTdept(Tdept tdept) {

        tdeptMapper.save(tdept);
    }

    public void saveTdepts(List<Tdept> tdepts) {

        if (tdepts == null) {
            return;
        }
        for (int i = 0; i < tdepts.size(); i++) {
            tdeptMapper.save(tdepts.get(i));
        }
    }

    public void updateTdept(Tdept tdept) {
        tdeptMapper.update(tdept);

    }

    public void updateTdepts(List<Tdept> tdepts) {
        if (tdepts == null) {
            return;
        }
        for (int i = 0; i < tdepts.size(); i++) {
            tdeptMapper.update(tdepts.get(i));
        }
    }

    public Tdept getUniqueBy(Tdept tdept) {

        return tdeptMapper.getUniqueBy(tdept);
    }

    public List<Tdept> getBy(Tdept tdept) {

        return tdeptMapper.getBy(tdept);
    }

    public Integer count(Tdept tdept) {

        return tdeptMapper.count(tdept);
    }

}
