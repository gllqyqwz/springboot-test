package com.wenzq.remote.api.impl.test;

import com.alibaba.fastjson.JSON;
import com.wenzq.api.test.MyDubboTest;
import com.wenzq.persistence.entity.test.Test;
import com.wenzq.service.business.test.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myDubboTest")
public class MyDubboTestImpl implements MyDubboTest {
    private static final Logger logger = LoggerFactory.getLogger(MyDubboTestImpl.class);
    private static final String LOGPRESTR = ">>>>>>: ";

    @Autowired
    private TestService testService;

    @Override
    public String test(String requestStr) {
        logger.info("com.wenzq.remote.api.impl.test.MyTestImpl.test params: {}", requestStr);

        try{
            Test test = testService.selectById(1);

            String testJson = JSON.toJSONString(test);
            logger.info(LOGPRESTR, testJson);
        }catch (Exception e){
            logger.error("MyTestImpl.test 异常：", e);
        }

        return requestStr;
    }

}
