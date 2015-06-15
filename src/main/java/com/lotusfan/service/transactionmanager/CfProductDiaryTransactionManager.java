package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CfProductDiaryMapper;
import com.lotusfan.model.CfProductDiary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CfProductDiaryTransactionManager {



    @Autowired
    private CfProductDiaryMapper cfProductDiaryMapper;


    public void saveCfProductDiary(CfProductDiary cfProductDiary) {

        cfProductDiaryMapper.save(cfProductDiary);
    }

    public void saveCfProductDiarys(List<CfProductDiary> cfProductDiarys) {

        if (cfProductDiarys == null) {
            return;
        }
        for (int i = 0; i < cfProductDiarys.size(); i++) {
            cfProductDiaryMapper.save(cfProductDiarys.get(i));
        }
    }

    public void updateCfProductDiary(CfProductDiary cfProductDiary) {
        cfProductDiaryMapper.update(cfProductDiary);

    }

    public void updateCfProductDiarys(List<CfProductDiary> cfProductDiarys) {
        if (cfProductDiarys == null) {
            return;
        }
        for (int i = 0; i < cfProductDiarys.size(); i++) {
            cfProductDiaryMapper.update(cfProductDiarys.get(i));
        }
    }

    public CfProductDiary getUniqueBy(CfProductDiary cfProductDiary) {

        return cfProductDiaryMapper.getUniqueBy(cfProductDiary);
    }

    public List<CfProductDiary> getBy(CfProductDiary cfProductDiary) {

        return cfProductDiaryMapper.getBy(cfProductDiary);
    }

    public Integer count(CfProductDiary cfProductDiary) {

        return cfProductDiaryMapper.count(cfProductDiary);
    }

}
