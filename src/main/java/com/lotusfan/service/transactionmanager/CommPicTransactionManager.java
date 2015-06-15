package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CommPicMapper;
import com.lotusfan.model.CommPic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommPicTransactionManager {



    @Autowired
    private CommPicMapper commPicMapper;


    public void saveCommPic(CommPic commPic) {

        commPicMapper.save(commPic);
    }

    public void saveCommPics(List<CommPic> commPics) {

        if (commPics == null) {
            return;
        }
        for (int i = 0; i < commPics.size(); i++) {
            commPicMapper.save(commPics.get(i));
        }
    }

    public void updateCommPic(CommPic commPic) {
        commPicMapper.update(commPic);

    }

    public void updateCommPics(List<CommPic> commPics) {
        if (commPics == null) {
            return;
        }
        for (int i = 0; i < commPics.size(); i++) {
            commPicMapper.update(commPics.get(i));
        }
    }

    public CommPic getUniqueBy(CommPic commPic) {

        return commPicMapper.getUniqueBy(commPic);
    }

    public List<CommPic> getBy(CommPic commPic) {

        return commPicMapper.getBy(commPic);
    }

    public Integer count(CommPic commPic) {

        return commPicMapper.count(commPic);
    }

}
