package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.RtBaseinfoMapper;
import com.lotusfan.model.RtBaseinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RtBaseinfoTransactionManager {



    @Autowired
    private RtBaseinfoMapper rtBaseinfoMapper;


    public void saveRtBaseinfo(RtBaseinfo rtBaseinfo) {

        rtBaseinfoMapper.save(rtBaseinfo);
    }

    public void saveRtBaseinfos(List<RtBaseinfo> rtBaseinfos) {

        if (rtBaseinfos == null) {
            return;
        }
        for (int i = 0; i < rtBaseinfos.size(); i++) {
            rtBaseinfoMapper.save(rtBaseinfos.get(i));
        }
    }

    public void updateRtBaseinfo(RtBaseinfo rtBaseinfo) {
        rtBaseinfoMapper.update(rtBaseinfo);

    }

    public void updateRtBaseinfos(List<RtBaseinfo> rtBaseinfos) {
        if (rtBaseinfos == null) {
            return;
        }
        for (int i = 0; i < rtBaseinfos.size(); i++) {
            rtBaseinfoMapper.update(rtBaseinfos.get(i));
        }
    }

    public RtBaseinfo getUniqueBy(RtBaseinfo rtBaseinfo) {

        return rtBaseinfoMapper.getUniqueBy(rtBaseinfo);
    }

    public List<RtBaseinfo> getBy(RtBaseinfo rtBaseinfo) {

        return rtBaseinfoMapper.getBy(rtBaseinfo);
    }

    public Integer count(RtBaseinfo rtBaseinfo) {

        return rtBaseinfoMapper.count(rtBaseinfo);
    }

}
