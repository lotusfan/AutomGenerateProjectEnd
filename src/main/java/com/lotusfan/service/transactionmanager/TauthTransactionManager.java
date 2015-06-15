package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TauthMapper;
import com.lotusfan.model.Tauth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TauthTransactionManager {



    @Autowired
    private TauthMapper tauthMapper;


    public void saveTauth(Tauth tauth) {

        tauthMapper.save(tauth);
    }

    public void saveTauths(List<Tauth> tauths) {

        if (tauths == null) {
            return;
        }
        for (int i = 0; i < tauths.size(); i++) {
            tauthMapper.save(tauths.get(i));
        }
    }

    public void updateTauth(Tauth tauth) {
        tauthMapper.update(tauth);

    }

    public void updateTauths(List<Tauth> tauths) {
        if (tauths == null) {
            return;
        }
        for (int i = 0; i < tauths.size(); i++) {
            tauthMapper.update(tauths.get(i));
        }
    }

    public Tauth getUniqueBy(Tauth tauth) {

        return tauthMapper.getUniqueBy(tauth);
    }

    public List<Tauth> getBy(Tauth tauth) {

        return tauthMapper.getBy(tauth);
    }

    public Integer count(Tauth tauth) {

        return tauthMapper.count(tauth);
    }

}
