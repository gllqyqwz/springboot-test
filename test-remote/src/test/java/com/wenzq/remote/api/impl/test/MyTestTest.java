package com.wenzq.remote.api.impl.test;

import com.wenzq.api.test.MyDubboTest;
import com.wenzq.remote.TestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestApplication.class})
public class MyTestTest {

    private static final Logger logger = LoggerFactory.getLogger(MyTestTest.class);

    @Autowired
    private MyDubboTest myTest;

    @Test
    public void test(){
        String requestStr = "wenzq";

        String test = myTest.test(requestStr);

        logger.info(">>>>>>: ", test);
    }

}
