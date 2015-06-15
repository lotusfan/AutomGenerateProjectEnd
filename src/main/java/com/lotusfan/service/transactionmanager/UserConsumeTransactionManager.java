package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.UserConsumeMapper;
import com.lotusfan.model.UserConsume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserConsumeTransactionManager {



    @Autowired
    private UserConsumeMapper userConsumeMapper;


    public void saveUserConsume(UserConsume userConsume) {

        userConsumeMapper.save(userConsume);
    }

    public void saveUserConsumes(List<UserConsume> userConsumes) {

        if (userConsumes == null) {
            return;
        }
        for (int i = 0; i < userConsumes.size(); i++) {
            userConsumeMapper.save(userConsumes.get(i));
        }
    }

    public void updateUserConsume(UserConsume userConsume) {
        userConsumeMapper.update(userConsume);

    }

    public void updateUserConsumes(List<UserConsume> userConsumes) {
        if (userConsumes == null) {
            return;
        }
        for (int i = 0; i < userConsumes.size(); i++) {
            userConsumeMapper.update(userConsumes.get(i));
        }
    }

    public UserConsume getUniqueBy(UserConsume userConsume) {

        return userConsumeMapper.getUniqueBy(userConsume);
    }

    public List<UserConsume> getBy(UserConsume userConsume) {

        return userConsumeMapper.getBy(userConsume);
    }

    public Integer count(UserConsume userConsume) {

        return userConsumeMapper.count(userConsume);
    }

}
