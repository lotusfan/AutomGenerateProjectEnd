package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.UserBankcardMapper;
import com.lotusfan.model.UserBankcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBankcardTransactionManager {



    @Autowired
    private UserBankcardMapper userBankcardMapper;


    public void saveUserBankcard(UserBankcard userBankcard) {

        userBankcardMapper.save(userBankcard);
    }

    public void saveUserBankcards(List<UserBankcard> userBankcards) {

        if (userBankcards == null) {
            return;
        }
        for (int i = 0; i < userBankcards.size(); i++) {
            userBankcardMapper.save(userBankcards.get(i));
        }
    }

    public void updateUserBankcard(UserBankcard userBankcard) {
        userBankcardMapper.update(userBankcard);

    }

    public void updateUserBankcards(List<UserBankcard> userBankcards) {
        if (userBankcards == null) {
            return;
        }
        for (int i = 0; i < userBankcards.size(); i++) {
            userBankcardMapper.update(userBankcards.get(i));
        }
    }

    public UserBankcard getUniqueBy(UserBankcard userBankcard) {

        return userBankcardMapper.getUniqueBy(userBankcard);
    }

    public List<UserBankcard> getBy(UserBankcard userBankcard) {

        return userBankcardMapper.getBy(userBankcard);
    }

    public Integer count(UserBankcard userBankcard) {

        return userBankcardMapper.count(userBankcard);
    }

}
