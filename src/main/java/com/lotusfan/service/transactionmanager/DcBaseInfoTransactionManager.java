package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.DcBaseInfoMapper;
import com.lotusfan.model.DcBaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DcBaseInfoTransactionManager {



    @Autowired
    private DcBaseInfoMapper dcBaseInfoMapper;


    public void saveDcBaseInfo(DcBaseInfo dcBaseInfo) {

        dcBaseInfoMapper.save(dcBaseInfo);
    }

    public void saveDcBaseInfos(List<DcBaseInfo> dcBaseInfos) {

        if (dcBaseInfos == null) {
            return;
        }
        for (int i = 0; i < dcBaseInfos.size(); i++) {
            dcBaseInfoMapper.save(dcBaseInfos.get(i));
        }
    }

    public void updateDcBaseInfo(DcBaseInfo dcBaseInfo) {
        dcBaseInfoMapper.update(dcBaseInfo);

    }

    public void updateDcBaseInfos(List<DcBaseInfo> dcBaseInfos) {
        if (dcBaseInfos == null) {
            return;
        }
        for (int i = 0; i < dcBaseInfos.size(); i++) {
            dcBaseInfoMapper.update(dcBaseInfos.get(i));
        }
    }

    public DcBaseInfo getUniqueBy(DcBaseInfo dcBaseInfo) {

        return dcBaseInfoMapper.getUniqueBy(dcBaseInfo);
    }

    public List<DcBaseInfo> getBy(DcBaseInfo dcBaseInfo) {

        return dcBaseInfoMapper.getBy(dcBaseInfo);
    }

    public Integer count(DcBaseInfo dcBaseInfo) {

        return dcBaseInfoMapper.count(dcBaseInfo);
    }

}
