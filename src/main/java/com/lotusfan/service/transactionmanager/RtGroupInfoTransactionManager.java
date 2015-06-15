package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.RtGroupInfoMapper;
import com.lotusfan.model.RtGroupInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RtGroupInfoTransactionManager {



    @Autowired
    private RtGroupInfoMapper rtGroupInfoMapper;


    public void saveRtGroupInfo(RtGroupInfo rtGroupInfo) {

        rtGroupInfoMapper.save(rtGroupInfo);
    }

    public void saveRtGroupInfos(List<RtGroupInfo> rtGroupInfos) {

        if (rtGroupInfos == null) {
            return;
        }
        for (int i = 0; i < rtGroupInfos.size(); i++) {
            rtGroupInfoMapper.save(rtGroupInfos.get(i));
        }
    }

    public void updateRtGroupInfo(RtGroupInfo rtGroupInfo) {
        rtGroupInfoMapper.update(rtGroupInfo);

    }

    public void updateRtGroupInfos(List<RtGroupInfo> rtGroupInfos) {
        if (rtGroupInfos == null) {
            return;
        }
        for (int i = 0; i < rtGroupInfos.size(); i++) {
            rtGroupInfoMapper.update(rtGroupInfos.get(i));
        }
    }

    public RtGroupInfo getUniqueBy(RtGroupInfo rtGroupInfo) {

        return rtGroupInfoMapper.getUniqueBy(rtGroupInfo);
    }

    public List<RtGroupInfo> getBy(RtGroupInfo rtGroupInfo) {

        return rtGroupInfoMapper.getBy(rtGroupInfo);
    }

    public Integer count(RtGroupInfo rtGroupInfo) {

        return rtGroupInfoMapper.count(rtGroupInfo);
    }

}
