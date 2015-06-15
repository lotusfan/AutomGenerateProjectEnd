package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.RtAttendInfoMapper;
import com.lotusfan.model.RtAttendInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RtAttendInfoTransactionManager {



    @Autowired
    private RtAttendInfoMapper rtAttendInfoMapper;


    public void saveRtAttendInfo(RtAttendInfo rtAttendInfo) {

        rtAttendInfoMapper.save(rtAttendInfo);
    }

    public void saveRtAttendInfos(List<RtAttendInfo> rtAttendInfos) {

        if (rtAttendInfos == null) {
            return;
        }
        for (int i = 0; i < rtAttendInfos.size(); i++) {
            rtAttendInfoMapper.save(rtAttendInfos.get(i));
        }
    }

    public void updateRtAttendInfo(RtAttendInfo rtAttendInfo) {
        rtAttendInfoMapper.update(rtAttendInfo);

    }

    public void updateRtAttendInfos(List<RtAttendInfo> rtAttendInfos) {
        if (rtAttendInfos == null) {
            return;
        }
        for (int i = 0; i < rtAttendInfos.size(); i++) {
            rtAttendInfoMapper.update(rtAttendInfos.get(i));
        }
    }

    public RtAttendInfo getUniqueBy(RtAttendInfo rtAttendInfo) {

        return rtAttendInfoMapper.getUniqueBy(rtAttendInfo);
    }

    public List<RtAttendInfo> getBy(RtAttendInfo rtAttendInfo) {

        return rtAttendInfoMapper.getBy(rtAttendInfo);
    }

    public Integer count(RtAttendInfo rtAttendInfo) {

        return rtAttendInfoMapper.count(rtAttendInfo);
    }

}
