package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TroletauthMapper;
import com.lotusfan.model.Troletauth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TroletauthTransactionManager {



    @Autowired
    private TroletauthMapper troletauthMapper;


    public void saveTroletauth(Troletauth troletauth) {

        troletauthMapper.save(troletauth);
    }

    public void saveTroletauths(List<Troletauth> troletauths) {

        if (troletauths == null) {
            return;
        }
        for (int i = 0; i < troletauths.size(); i++) {
            troletauthMapper.save(troletauths.get(i));
        }
    }

    public void updateTroletauth(Troletauth troletauth) {
        troletauthMapper.update(troletauth);

    }

    public void updateTroletauths(List<Troletauth> troletauths) {
        if (troletauths == null) {
            return;
        }
        for (int i = 0; i < troletauths.size(); i++) {
            troletauthMapper.update(troletauths.get(i));
        }
    }

    public Troletauth getUniqueBy(Troletauth troletauth) {

        return troletauthMapper.getUniqueBy(troletauth);
    }

    public List<Troletauth> getBy(Troletauth troletauth) {

        return troletauthMapper.getBy(troletauth);
    }

    public Integer count(Troletauth troletauth) {

        return troletauthMapper.count(troletauth);
    }

}
