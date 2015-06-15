package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CfSupportOptionMapper;
import com.lotusfan.model.CfSupportOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CfSupportOptionTransactionManager {



    @Autowired
    private CfSupportOptionMapper cfSupportOptionMapper;


    public void saveCfSupportOption(CfSupportOption cfSupportOption) {

        cfSupportOptionMapper.save(cfSupportOption);
    }

    public void saveCfSupportOptions(List<CfSupportOption> cfSupportOptions) {

        if (cfSupportOptions == null) {
            return;
        }
        for (int i = 0; i < cfSupportOptions.size(); i++) {
            cfSupportOptionMapper.save(cfSupportOptions.get(i));
        }
    }

    public void updateCfSupportOption(CfSupportOption cfSupportOption) {
        cfSupportOptionMapper.update(cfSupportOption);

    }

    public void updateCfSupportOptions(List<CfSupportOption> cfSupportOptions) {
        if (cfSupportOptions == null) {
            return;
        }
        for (int i = 0; i < cfSupportOptions.size(); i++) {
            cfSupportOptionMapper.update(cfSupportOptions.get(i));
        }
    }

    public CfSupportOption getUniqueBy(CfSupportOption cfSupportOption) {

        return cfSupportOptionMapper.getUniqueBy(cfSupportOption);
    }

    public List<CfSupportOption> getBy(CfSupportOption cfSupportOption) {

        return cfSupportOptionMapper.getBy(cfSupportOption);
    }

    public Integer count(CfSupportOption cfSupportOption) {

        return cfSupportOptionMapper.count(cfSupportOption);
    }

}
