package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.PayLogInfoMapper;
import com.lotusfan.model.PayLogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayLogInfoTransactionManager {



    @Autowired
    private PayLogInfoMapper payLogInfoMapper;


    public void savePayLogInfo(PayLogInfo payLogInfo) {

        payLogInfoMapper.save(payLogInfo);
    }

    public void savePayLogInfos(List<PayLogInfo> payLogInfos) {

        if (payLogInfos == null) {
            return;
        }
        for (int i = 0; i < payLogInfos.size(); i++) {
            payLogInfoMapper.save(payLogInfos.get(i));
        }
    }

    public void updatePayLogInfo(PayLogInfo payLogInfo) {
        payLogInfoMapper.update(payLogInfo);

    }

    public void updatePayLogInfos(List<PayLogInfo> payLogInfos) {
        if (payLogInfos == null) {
            return;
        }
        for (int i = 0; i < payLogInfos.size(); i++) {
            payLogInfoMapper.update(payLogInfos.get(i));
        }
    }

    public PayLogInfo getUniqueBy(PayLogInfo payLogInfo) {

        return payLogInfoMapper.getUniqueBy(payLogInfo);
    }

    public List<PayLogInfo> getBy(PayLogInfo payLogInfo) {

        return payLogInfoMapper.getBy(payLogInfo);
    }

    public Integer count(PayLogInfo payLogInfo) {

        return payLogInfoMapper.count(payLogInfo);
    }

}
