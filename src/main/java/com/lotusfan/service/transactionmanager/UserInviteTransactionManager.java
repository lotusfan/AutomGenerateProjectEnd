package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.UserInviteMapper;
import com.lotusfan.model.UserInvite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInviteTransactionManager {



    @Autowired
    private UserInviteMapper userInviteMapper;


    public void saveUserInvite(UserInvite userInvite) {

        userInviteMapper.save(userInvite);
    }

    public void saveUserInvites(List<UserInvite> userInvites) {

        if (userInvites == null) {
            return;
        }
        for (int i = 0; i < userInvites.size(); i++) {
            userInviteMapper.save(userInvites.get(i));
        }
    }

    public void updateUserInvite(UserInvite userInvite) {
        userInviteMapper.update(userInvite);

    }

    public void updateUserInvites(List<UserInvite> userInvites) {
        if (userInvites == null) {
            return;
        }
        for (int i = 0; i < userInvites.size(); i++) {
            userInviteMapper.update(userInvites.get(i));
        }
    }

    public UserInvite getUniqueBy(UserInvite userInvite) {

        return userInviteMapper.getUniqueBy(userInvite);
    }

    public List<UserInvite> getBy(UserInvite userInvite) {

        return userInviteMapper.getBy(userInvite);
    }

    public Integer count(UserInvite userInvite) {

        return userInviteMapper.count(userInvite);
    }

}
