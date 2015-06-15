package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CommAreaMapper;
import com.lotusfan.model.CommArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommAreaTransactionManager {



    @Autowired
    private CommAreaMapper commAreaMapper;


    public void saveCommArea(CommArea commArea) {

        commAreaMapper.save(commArea);
    }

    public void saveCommAreas(List<CommArea> commAreas) {

        if (commAreas == null) {
            return;
        }
        for (int i = 0; i < commAreas.size(); i++) {
            commAreaMapper.save(commAreas.get(i));
        }
    }

    public void updateCommArea(CommArea commArea) {
        commAreaMapper.update(commArea);

    }

    public void updateCommAreas(List<CommArea> commAreas) {
        if (commAreas == null) {
            return;
        }
        for (int i = 0; i < commAreas.size(); i++) {
            commAreaMapper.update(commAreas.get(i));
        }
    }

    public CommArea getUniqueBy(CommArea commArea) {

        return commAreaMapper.getUniqueBy(commArea);
    }

    public List<CommArea> getBy(CommArea commArea) {

        return commAreaMapper.getBy(commArea);
    }

    public Integer count(CommArea commArea) {

        return commAreaMapper.count(commArea);
    }

}
