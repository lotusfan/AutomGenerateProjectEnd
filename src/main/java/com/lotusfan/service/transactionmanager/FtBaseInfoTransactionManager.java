package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.FtBaseInfoMapper;
import com.lotusfan.model.FtBaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FtBaseInfoTransactionManager {



    @Autowired
    private FtBaseInfoMapper ftBaseInfoMapper;


    public void saveFtBaseInfo(FtBaseInfo ftBaseInfo) {

        ftBaseInfoMapper.save(ftBaseInfo);
    }

    public void saveFtBaseInfos(List<FtBaseInfo> ftBaseInfos) {

        if (ftBaseInfos == null) {
            return;
        }
        for (int i = 0; i < ftBaseInfos.size(); i++) {
            ftBaseInfoMapper.save(ftBaseInfos.get(i));
        }
    }

    public void updateFtBaseInfo(FtBaseInfo ftBaseInfo) {
        ftBaseInfoMapper.update(ftBaseInfo);

    }

    public void updateFtBaseInfos(List<FtBaseInfo> ftBaseInfos) {
        if (ftBaseInfos == null) {
            return;
        }
        for (int i = 0; i < ftBaseInfos.size(); i++) {
            ftBaseInfoMapper.update(ftBaseInfos.get(i));
        }
    }

    public FtBaseInfo getUniqueBy(FtBaseInfo ftBaseInfo) {

        return ftBaseInfoMapper.getUniqueBy(ftBaseInfo);
    }

    public List<FtBaseInfo> getBy(FtBaseInfo ftBaseInfo) {

        return ftBaseInfoMapper.getBy(ftBaseInfo);
    }

    public Integer count(FtBaseInfo ftBaseInfo) {

        return ftBaseInfoMapper.count(ftBaseInfo);
    }

}
