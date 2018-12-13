package com.wenzq.remote.api.impl.test;

import com.alibaba.fastjson.JSON;
import com.wenzq.api.test.MyTest;
import com.wenzq.persistence.entity.test.Test;
import com.wenzq.service.business.test.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myTest")
public class MyTestImpl implements MyTest {
    private static  final Logger logger = LoggerFactory.getLogger(MyTestImpl.class);

    @Autowired
    private TestService testService;

    @Override
    public String test(String requestStr) {
        logger.info("com.wenzq.remote.api.impl.test.MyTestImpl.test params: {}", requestStr);

        try{
            Test test = testService.selectById(1);

            logger.info(">>>>>>: ", JSON.toJSONString(test));
        }catch (Exception e){
            e.printStackTrace();
        }

        return requestStr;
    }

}
