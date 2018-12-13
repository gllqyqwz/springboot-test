package com.wenzq.remote.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * 数据源配置
 */
@Configuration
@EnableTransactionManagement
@PropertySource(value = {"file:/etc/dbprivatekey.properties"}, ignoreResourceNotFound = true)
public class DataSourceConfiguration implements TransactionManagementConfigurer {

    private static  final Logger logger = LoggerFactory.getLogger(DataSourceConfiguration.class);

    /**
     * btoc库数据
     * @return
     */
    @Bean(name = "testDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.test.datasource")
    public DataSource ywuserDataSource() {
        logger.info("==================test库数据源初始化==================");
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }

    /**
     * 事务配置,考虑多数据源情况下
     * @return
     */
    @Bean
    public PlatformTransactionManager txManager() {
        return new DataSourceTransactionManager(ywuserDataSource());
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return txManager();
    }
}
