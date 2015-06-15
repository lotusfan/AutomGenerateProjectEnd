package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.UserIncomeMapper;
import com.lotusfan.model.UserIncome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserIncomeTransactionManager {



    @Autowired
    private UserIncomeMapper userIncomeMapper;


    public void saveUserIncome(UserIncome userIncome) {

        userIncomeMapper.save(userIncome);
    }

    public void saveUserIncomes(List<UserIncome> userIncomes) {

        if (userIncomes == null) {
            return;
        }
        for (int i = 0; i < userIncomes.size(); i++) {
            userIncomeMapper.save(userIncomes.get(i));
        }
    }

    public void updateUserIncome(UserIncome userIncome) {
        userIncomeMapper.update(userIncome);

    }

    public void updateUserIncomes(List<UserIncome> userIncomes) {
        if (userIncomes == null) {
            return;
        }
        for (int i = 0; i < userIncomes.size(); i++) {
            userIncomeMapper.update(userIncomes.get(i));
        }
    }

    public UserIncome getUniqueBy(UserIncome userIncome) {

        return userIncomeMapper.getUniqueBy(userIncome);
    }

    public List<UserIncome> getBy(UserIncome userIncome) {

        return userIncomeMapper.getBy(userIncome);
    }

    public Integer count(UserIncome userIncome) {

        return userIncomeMapper.count(userIncome);
    }

}
