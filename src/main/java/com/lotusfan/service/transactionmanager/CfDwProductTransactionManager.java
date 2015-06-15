package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CfDwProductMapper;
import com.lotusfan.model.CfDwProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CfDwProductTransactionManager {



    @Autowired
    private CfDwProductMapper cfDwProductMapper;


    public void saveCfDwProduct(CfDwProduct cfDwProduct) {

        cfDwProductMapper.save(cfDwProduct);
    }

    public void saveCfDwProducts(List<CfDwProduct> cfDwProducts) {

        if (cfDwProducts == null) {
            return;
        }
        for (int i = 0; i < cfDwProducts.size(); i++) {
            cfDwProductMapper.save(cfDwProducts.get(i));
        }
    }

    public void updateCfDwProduct(CfDwProduct cfDwProduct) {
        cfDwProductMapper.update(cfDwProduct);

    }

    public void updateCfDwProducts(List<CfDwProduct> cfDwProducts) {
        if (cfDwProducts == null) {
            return;
        }
        for (int i = 0; i < cfDwProducts.size(); i++) {
            cfDwProductMapper.update(cfDwProducts.get(i));
        }
    }

    public CfDwProduct getUniqueBy(CfDwProduct cfDwProduct) {

        return cfDwProductMapper.getUniqueBy(cfDwProduct);
    }

    public List<CfDwProduct> getBy(CfDwProduct cfDwProduct) {

        return cfDwProductMapper.getBy(cfDwProduct);
    }

    public Integer count(CfDwProduct cfDwProduct) {

        return cfDwProductMapper.count(cfDwProduct);
    }

}
