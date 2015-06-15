package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CommDataInfoMapper;
import com.lotusfan.model.CommDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommDataInfoTransactionManager {



    @Autowired
    private CommDataInfoMapper commDataInfoMapper;


    public void saveCommDataInfo(CommDataInfo commDataInfo) {

        commDataInfoMapper.save(commDataInfo);
    }

    public void saveCommDataInfos(List<CommDataInfo> commDataInfos) {

        if (commDataInfos == null) {
            return;
        }
        for (int i = 0; i < commDataInfos.size(); i++) {
            commDataInfoMapper.save(commDataInfos.get(i));
        }
    }

    public void updateCommDataInfo(CommDataInfo commDataInfo) {
        commDataInfoMapper.update(commDataInfo);

    }

    public void updateCommDataInfos(List<CommDataInfo> commDataInfos) {
        if (commDataInfos == null) {
            return;
        }
        for (int i = 0; i < commDataInfos.size(); i++) {
            commDataInfoMapper.update(commDataInfos.get(i));
        }
    }

    public CommDataInfo getUniqueBy(CommDataInfo commDataInfo) {

        return commDataInfoMapper.getUniqueBy(commDataInfo);
    }

    public List<CommDataInfo> getBy(CommDataInfo commDataInfo) {

        return commDataInfoMapper.getBy(commDataInfo);
    }

    public Integer count(CommDataInfo commDataInfo) {

        return commDataInfoMapper.count(commDataInfo);
    }

}
