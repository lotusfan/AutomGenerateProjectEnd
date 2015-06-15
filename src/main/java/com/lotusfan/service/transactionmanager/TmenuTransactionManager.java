package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TmenuMapper;
import com.lotusfan.model.Tmenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TmenuTransactionManager {



    @Autowired
    private TmenuMapper tmenuMapper;


    public void saveTmenu(Tmenu tmenu) {

        tmenuMapper.save(tmenu);
    }

    public void saveTmenus(List<Tmenu> tmenus) {

        if (tmenus == null) {
            return;
        }
        for (int i = 0; i < tmenus.size(); i++) {
            tmenuMapper.save(tmenus.get(i));
        }
    }

    public void updateTmenu(Tmenu tmenu) {
        tmenuMapper.update(tmenu);

    }

    public void updateTmenus(List<Tmenu> tmenus) {
        if (tmenus == null) {
            return;
        }
        for (int i = 0; i < tmenus.size(); i++) {
            tmenuMapper.update(tmenus.get(i));
        }
    }

    public Tmenu getUniqueBy(Tmenu tmenu) {

        return tmenuMapper.getUniqueBy(tmenu);
    }

    public List<Tmenu> getBy(Tmenu tmenu) {

        return tmenuMapper.getBy(tmenu);
    }

    public Integer count(Tmenu tmenu) {

        return tmenuMapper.count(tmenu);
    }

}
