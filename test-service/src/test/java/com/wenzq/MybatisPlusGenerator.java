package com.wenzq;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class MybatisPlusGenerator {
    @Test
    public void generateCode() {
        String packageName = "com.wenzq";
        generateByTables(packageName,
            "test"
        );
    }

    private void generateByTables(String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(false)
            .setEnableCache(false)
            .setBaseResultMap(true)
            .setBaseColumnList(true)
            .setAuthor("wenzq")
            .setOutputDir("d:\\mybatis-plus")
            .setFileOverride(true)
            .setServiceName("%sService")
            .setMapperName("%sDao")
            .setXmlName("%sDao");
        
        DataSourceConfig dataSourceConfig = new DataSourceConfig()
            .setDbType(DbType.MYSQL)
            .setUrl("jdbc:mysql://118.25.48.224:3306/test?useUnicode=true&amp;characterEncoding=utf-8")
            .setUsername("wenzq")
            .setPassword("wenzq123456")
            .setDriverName("com.mysql.jdbc.Driver");
        
        StrategyConfig strategyConfig = new StrategyConfig()
            .setCapitalMode(true)
            .setEntityLombokModel(false)
            .setDbColumnUnderline(true)
            .setEntityColumnConstant(false)
            .entityTableFieldAnnotationEnable(true)
            .setTablePrefix("b2c_")
            .setNaming(NamingStrategy.underline_to_camel)
            .setSuperEntityClass("com.wenzq.persistence.entity.BaseModel")
            .setSuperMapperClass("com.wenzq.persistence.dao.BaseDao")
            .setSuperServiceClass("com.wenzq.service.business.BaseService")
            .setSuperServiceImplClass("com.wenzq.service.business.BaseServiceImpl")
            .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
    
        PackageConfig packageConfig = new PackageConfig()
            .setParent(packageName)
            .setEntity("model")
            .setMapper("dao")
            .setXml("mapper")
            .setController("controller");
        
        new AutoGenerator()
            .setGlobalConfig(config)
            .setDataSource(dataSourceConfig)
            .setStrategy(strategyConfig)
            .setPackageInfo(packageConfig)
            .execute();
    }
}
