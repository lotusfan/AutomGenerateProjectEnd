package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.DcTripMapper;
import com.lotusfan.model.DcTrip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DcTripTransactionManager {



    @Autowired
    private DcTripMapper dcTripMapper;


    public void saveDcTrip(DcTrip dcTrip) {

        dcTripMapper.save(dcTrip);
    }

    public void saveDcTrips(List<DcTrip> dcTrips) {

        if (dcTrips == null) {
            return;
        }
        for (int i = 0; i < dcTrips.size(); i++) {
            dcTripMapper.save(dcTrips.get(i));
        }
    }

    public void updateDcTrip(DcTrip dcTrip) {
        dcTripMapper.update(dcTrip);

    }

    public void updateDcTrips(List<DcTrip> dcTrips) {
        if (dcTrips == null) {
            return;
        }
        for (int i = 0; i < dcTrips.size(); i++) {
            dcTripMapper.update(dcTrips.get(i));
        }
    }

    public DcTrip getUniqueBy(DcTrip dcTrip) {

        return dcTripMapper.getUniqueBy(dcTrip);
    }

    public List<DcTrip> getBy(DcTrip dcTrip) {

        return dcTripMapper.getBy(dcTrip);
    }

    public Integer count(DcTrip dcTrip) {

        return dcTripMapper.count(dcTrip);
    }

}
