package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CfSupportOptionRecordMapper;
import com.lotusfan.model.CfSupportOptionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CfSupportOptionRecordTransactionManager {



    @Autowired
    private CfSupportOptionRecordMapper cfSupportOptionRecordMapper;


    public void saveCfSupportOptionRecord(CfSupportOptionRecord cfSupportOptionRecord) {

        cfSupportOptionRecordMapper.save(cfSupportOptionRecord);
    }

    public void saveCfSupportOptionRecords(List<CfSupportOptionRecord> cfSupportOptionRecords) {

        if (cfSupportOptionRecords == null) {
            return;
        }
        for (int i = 0; i < cfSupportOptionRecords.size(); i++) {
            cfSupportOptionRecordMapper.save(cfSupportOptionRecords.get(i));
        }
    }

    public void updateCfSupportOptionRecord(CfSupportOptionRecord cfSupportOptionRecord) {
        cfSupportOptionRecordMapper.update(cfSupportOptionRecord);

    }

    public void updateCfSupportOptionRecords(List<CfSupportOptionRecord> cfSupportOptionRecords) {
        if (cfSupportOptionRecords == null) {
            return;
        }
        for (int i = 0; i < cfSupportOptionRecords.size(); i++) {
            cfSupportOptionRecordMapper.update(cfSupportOptionRecords.get(i));
        }
    }

    public CfSupportOptionRecord getUniqueBy(CfSupportOptionRecord cfSupportOptionRecord) {

        return cfSupportOptionRecordMapper.getUniqueBy(cfSupportOptionRecord);
    }

    public List<CfSupportOptionRecord> getBy(CfSupportOptionRecord cfSupportOptionRecord) {

        return cfSupportOptionRecordMapper.getBy(cfSupportOptionRecord);
    }

    public Integer count(CfSupportOptionRecord cfSupportOptionRecord) {

        return cfSupportOptionRecordMapper.count(cfSupportOptionRecord);
    }

}
