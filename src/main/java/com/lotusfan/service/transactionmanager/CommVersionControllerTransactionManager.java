package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.CommVersionControllerMapper;
import com.lotusfan.model.CommVersionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommVersionControllerTransactionManager {



    @Autowired
    private CommVersionControllerMapper commVersionControllerMapper;


    public void saveCommVersionController(CommVersionController commVersionController) {

        commVersionControllerMapper.save(commVersionController);
    }

    public void saveCommVersionControllers(List<CommVersionController> commVersionControllers) {

        if (commVersionControllers == null) {
            return;
        }
        for (int i = 0; i < commVersionControllers.size(); i++) {
            commVersionControllerMapper.save(commVersionControllers.get(i));
        }
    }

    public void updateCommVersionController(CommVersionController commVersionController) {
        commVersionControllerMapper.update(commVersionController);

    }

    public void updateCommVersionControllers(List<CommVersionController> commVersionControllers) {
        if (commVersionControllers == null) {
            return;
        }
        for (int i = 0; i < commVersionControllers.size(); i++) {
            commVersionControllerMapper.update(commVersionControllers.get(i));
        }
    }

    public CommVersionController getUniqueBy(CommVersionController commVersionController) {

        return commVersionControllerMapper.getUniqueBy(commVersionController);
    }

    public List<CommVersionController> getBy(CommVersionController commVersionController) {

        return commVersionControllerMapper.getBy(commVersionController);
    }

    public Integer count(CommVersionController commVersionController) {

        return commVersionControllerMapper.count(commVersionController);
    }

}
