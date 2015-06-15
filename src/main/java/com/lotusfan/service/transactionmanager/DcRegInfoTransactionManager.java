package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.DcRegInfoMapper;
import com.lotusfan.model.DcRegInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DcRegInfoTransactionManager {



    @Autowired
    private DcRegInfoMapper dcRegInfoMapper;


    public void saveDcRegInfo(DcRegInfo dcRegInfo) {

        dcRegInfoMapper.save(dcRegInfo);
    }

    public void saveDcRegInfos(List<DcRegInfo> dcRegInfos) {

        if (dcRegInfos == null) {
            return;
        }
        for (int i = 0; i < dcRegInfos.size(); i++) {
            dcRegInfoMapper.save(dcRegInfos.get(i));
        }
    }

    public void updateDcRegInfo(DcRegInfo dcRegInfo) {
        dcRegInfoMapper.update(dcRegInfo);

    }

    public void updateDcRegInfos(List<DcRegInfo> dcRegInfos) {
        if (dcRegInfos == null) {
            return;
        }
        for (int i = 0; i < dcRegInfos.size(); i++) {
            dcRegInfoMapper.update(dcRegInfos.get(i));
        }
    }

    public DcRegInfo getUniqueBy(DcRegInfo dcRegInfo) {

        return dcRegInfoMapper.getUniqueBy(dcRegInfo);
    }

    public List<DcRegInfo> getBy(DcRegInfo dcRegInfo) {

        return dcRegInfoMapper.getBy(dcRegInfo);
    }

    public Integer count(DcRegInfo dcRegInfo) {

        return dcRegInfoMapper.count(dcRegInfo);
    }

}
