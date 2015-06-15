package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CfProductMapper;
import com.lotusfan.model.CfProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CfProductTransactionManager {



    @Autowired
    private CfProductMapper cfProductMapper;


    public void saveCfProduct(CfProduct cfProduct) {

        cfProductMapper.save(cfProduct);
    }

    public void saveCfProducts(List<CfProduct> cfProducts) {

        if (cfProducts == null) {
            return;
        }
        for (int i = 0; i < cfProducts.size(); i++) {
            cfProductMapper.save(cfProducts.get(i));
        }
    }

    public void updateCfProduct(CfProduct cfProduct) {
        cfProductMapper.update(cfProduct);

    }

    public void updateCfProducts(List<CfProduct> cfProducts) {
        if (cfProducts == null) {
            return;
        }
        for (int i = 0; i < cfProducts.size(); i++) {
            cfProductMapper.update(cfProducts.get(i));
        }
    }

    public CfProduct getUniqueBy(CfProduct cfProduct) {

        return cfProductMapper.getUniqueBy(cfProduct);
    }

    public List<CfProduct> getBy(CfProduct cfProduct) {

        return cfProductMapper.getBy(cfProduct);
    }

    public Integer count(CfProduct cfProduct) {

        return cfProductMapper.count(cfProduct);
    }

}
