package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TransInfoMapper;
import com.lotusfan.model.TransInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransInfoTransactionManager {



    @Autowired
    private TransInfoMapper transInfoMapper;


    public void saveTransInfo(TransInfo transInfo) {

        transInfoMapper.save(transInfo);
    }

    public void saveTransInfos(List<TransInfo> transInfos) {

        if (transInfos == null) {
            return;
        }
        for (int i = 0; i < transInfos.size(); i++) {
            transInfoMapper.save(transInfos.get(i));
        }
    }

    public void updateTransInfo(TransInfo transInfo) {
        transInfoMapper.update(transInfo);

    }

    public void updateTransInfos(List<TransInfo> transInfos) {
        if (transInfos == null) {
            return;
        }
        for (int i = 0; i < transInfos.size(); i++) {
            transInfoMapper.update(transInfos.get(i));
        }
    }

    public TransInfo getUniqueBy(TransInfo transInfo) {

        return transInfoMapper.getUniqueBy(transInfo);
    }

    public List<TransInfo> getBy(TransInfo transInfo) {

        return transInfoMapper.getBy(transInfo);
    }

    public Integer count(TransInfo transInfo) {

        return transInfoMapper.count(transInfo);
    }

}
