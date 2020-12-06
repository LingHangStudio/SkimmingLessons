package com.linghang.skimlessons.config;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author 田
 * 数据源配置（武科大助手 数据库）
 */
@Configuration//标记 此类为配置类
@EnableConfigurationProperties
@MapperScan(basePackages = "com.linghang.skimlessons.dao",
        sqlSessionTemplateRef = "sqlSessionTemplate")
public class DBConfig {
    /**
     * spring 容器初始化时添加数据源的DataSource对象Bean
     * @return DataSource对象
     */
    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource")//application.yml中读取数据源信息
    public DataSource dataSource() {
        return DruidDataSourceBuilder.create().build();
    }


    /**
     * 配置Session工厂
     * @param dataSource 数据源
     * @return SqlSessionFactory对象
     * @throws Exception 异常
     */
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(
            @Qualifier("dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().
                getResources("classpath*:/mapper/*.xml"));
        return bean.getObject();
    }

    @Bean("dataSourceTransactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager(
            @Qualifier("dataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }


    /**
     * 模板
     * @param sqlSessionFactory sql过程工厂
     * @return sql过程模板
     */
    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(
            @Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

