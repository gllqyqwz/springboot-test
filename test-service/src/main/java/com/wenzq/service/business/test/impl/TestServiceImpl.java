package com.wenzq.service.business.test.impl;

import com.wenzq.persistence.dao.test.TestDao;
import com.wenzq.persistence.entity.test.Test;
import com.wenzq.service.business.BaseServiceImpl;
import com.wenzq.service.business.test.TestService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wenzq
 * @since 2018-11-26
 */
@Service
public class TestServiceImpl extends BaseServiceImpl<TestDao, Test> implements TestService {

}
