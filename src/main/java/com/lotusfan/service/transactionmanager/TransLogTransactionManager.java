package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TransLogMapper;
import com.lotusfan.model.TransLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransLogTransactionManager {



    @Autowired
    private TransLogMapper transLogMapper;


    public void saveTransLog(TransLog transLog) {

        transLogMapper.save(transLog);
    }

    public void saveTransLogs(List<TransLog> transLogs) {

        if (transLogs == null) {
            return;
        }
        for (int i = 0; i < transLogs.size(); i++) {
            transLogMapper.save(transLogs.get(i));
        }
    }

    public void updateTransLog(TransLog transLog) {
        transLogMapper.update(transLog);

    }

    public void updateTransLogs(List<TransLog> transLogs) {
        if (transLogs == null) {
            return;
        }
        for (int i = 0; i < transLogs.size(); i++) {
            transLogMapper.update(transLogs.get(i));
        }
    }

    public TransLog getUniqueBy(TransLog transLog) {

        return transLogMapper.getUniqueBy(transLog);
    }

    public List<TransLog> getBy(TransLog transLog) {

        return transLogMapper.getBy(transLog);
    }

    public Integer count(TransLog transLog) {

        return transLogMapper.count(transLog);
    }

}
