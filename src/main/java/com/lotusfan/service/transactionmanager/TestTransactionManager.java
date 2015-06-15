package com.lotusfan.service.transactionmanager;

import com.lotusfan.dao.TestMapper;
import com.lotusfan.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestTransactionManager {



    @Autowired
    private TestMapper testMapper;


    public void saveTest(Test test) {

        testMapper.save(test);
    }

    public void saveTests(List<Test> tests) {

        if (tests == null) {
            return;
        }
        for (int i = 0; i < tests.size(); i++) {
            testMapper.save(tests.get(i));
        }
    }

    public void updateTest(Test test) {
        testMapper.update(test);

    }

    public void updateTests(List<Test> tests) {
        if (tests == null) {
            return;
        }
        for (int i = 0; i < tests.size(); i++) {
            testMapper.update(tests.get(i));
        }
    }

    public Test getUniqueBy(Test test) {

        return testMapper.getUniqueBy(test);
    }

    public List<Test> getBy(Test test) {

        return testMapper.getBy(test);
    }

    public Integer count(Test test) {

        return testMapper.count(test);
    }

}
