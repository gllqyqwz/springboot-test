package com.wenzq.service.business;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wenzq.persistence.dao.BaseDao;

/**
 * 基础service实现
 * @author liuxianqiang
 *
 */
public class BaseServiceImpl<M extends BaseDao<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {

}
