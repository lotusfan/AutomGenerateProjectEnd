package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.MyTicketHelpMapper;
import com.lotusfan.model.MyTicketHelp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyTicketHelpTransactionManager {



    @Autowired
    private MyTicketHelpMapper myTicketHelpMapper;


    public void saveMyTicketHelp(MyTicketHelp myTicketHelp) {

        myTicketHelpMapper.save(myTicketHelp);
    }

    public void saveMyTicketHelps(List<MyTicketHelp> myTicketHelps) {

        if (myTicketHelps == null) {
            return;
        }
        for (int i = 0; i < myTicketHelps.size(); i++) {
            myTicketHelpMapper.save(myTicketHelps.get(i));
        }
    }

    public void updateMyTicketHelp(MyTicketHelp myTicketHelp) {
        myTicketHelpMapper.update(myTicketHelp);

    }

    public void updateMyTicketHelps(List<MyTicketHelp> myTicketHelps) {
        if (myTicketHelps == null) {
            return;
        }
        for (int i = 0; i < myTicketHelps.size(); i++) {
            myTicketHelpMapper.update(myTicketHelps.get(i));
        }
    }

    public MyTicketHelp getUniqueBy(MyTicketHelp myTicketHelp) {

        return myTicketHelpMapper.getUniqueBy(myTicketHelp);
    }

    public List<MyTicketHelp> getBy(MyTicketHelp myTicketHelp) {

        return myTicketHelpMapper.getBy(myTicketHelp);
    }

    public Integer count(MyTicketHelp myTicketHelp) {

        return myTicketHelpMapper.count(myTicketHelp);
    }

}
