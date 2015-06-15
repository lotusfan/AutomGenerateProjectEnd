package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.UserBaseinfoMapper;
import com.lotusfan.model.UserBaseinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBaseinfoTransactionManager {



    @Autowired
    private UserBaseinfoMapper userBaseinfoMapper;


    public void saveUserBaseinfo(UserBaseinfo userBaseinfo) {

        userBaseinfoMapper.save(userBaseinfo);
    }

    public void saveUserBaseinfos(List<UserBaseinfo> userBaseinfos) {

        if (userBaseinfos == null) {
            return;
        }
        for (int i = 0; i < userBaseinfos.size(); i++) {
            userBaseinfoMapper.save(userBaseinfos.get(i));
        }
    }

    public void updateUserBaseinfo(UserBaseinfo userBaseinfo) {
        userBaseinfoMapper.update(userBaseinfo);

    }

    public void updateUserBaseinfos(List<UserBaseinfo> userBaseinfos) {
        if (userBaseinfos == null) {
            return;
        }
        for (int i = 0; i < userBaseinfos.size(); i++) {
            userBaseinfoMapper.update(userBaseinfos.get(i));
        }
    }

    public UserBaseinfo getUniqueBy(UserBaseinfo userBaseinfo) {

        return userBaseinfoMapper.getUniqueBy(userBaseinfo);
    }

    public List<UserBaseinfo> getBy(UserBaseinfo userBaseinfo) {

        return userBaseinfoMapper.getBy(userBaseinfo);
    }

    public Integer count(UserBaseinfo userBaseinfo) {

        return userBaseinfoMapper.count(userBaseinfo);
    }

}
