package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CfDwTripMapper;
import com.lotusfan.model.CfDwTrip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CfDwTripTransactionManager {



    @Autowired
    private CfDwTripMapper cfDwTripMapper;


    public void saveCfDwTrip(CfDwTrip cfDwTrip) {

        cfDwTripMapper.save(cfDwTrip);
    }

    public void saveCfDwTrips(List<CfDwTrip> cfDwTrips) {

        if (cfDwTrips == null) {
            return;
        }
        for (int i = 0; i < cfDwTrips.size(); i++) {
            cfDwTripMapper.save(cfDwTrips.get(i));
        }
    }

    public void updateCfDwTrip(CfDwTrip cfDwTrip) {
        cfDwTripMapper.update(cfDwTrip);

    }

    public void updateCfDwTrips(List<CfDwTrip> cfDwTrips) {
        if (cfDwTrips == null) {
            return;
        }
        for (int i = 0; i < cfDwTrips.size(); i++) {
            cfDwTripMapper.update(cfDwTrips.get(i));
        }
    }

    public CfDwTrip getUniqueBy(CfDwTrip cfDwTrip) {

        return cfDwTripMapper.getUniqueBy(cfDwTrip);
    }

    public List<CfDwTrip> getBy(CfDwTrip cfDwTrip) {

        return cfDwTripMapper.getBy(cfDwTrip);
    }

    public Integer count(CfDwTrip cfDwTrip) {

        return cfDwTripMapper.count(cfDwTrip);
    }

}
