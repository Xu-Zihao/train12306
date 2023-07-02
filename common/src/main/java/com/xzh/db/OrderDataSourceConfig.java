package com.xzh.db;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.xzh.orderDao",sqlSessionTemplateRef = "orderSqlSessionTemplate")
public class OrderDataSourceConfig {
    private final static Logger LOGGER = LoggerFactory.getLogger(OrderDataSourceConfig.class);

    @Bean(name = DataSources.TRAIN_ORDER_DB)
    @ConfigurationProperties(prefix = "spring.datasource-order")
    public DataSource orderDB(){
        DataSource ds =DataSourceBuilder.create().build();
        return ds;
    }

    @Bean(name = "orderTransactionManager")
    public DataSourceTransactionManager orderTransactionManager(@Qualifier(DataSources.TRAIN_ORDER_DB) DataSource orderDB){
        return new DataSourceTransactionManager(orderDB);
    }

    @Bean(name = "orderSqlSessionFactory")
    public SqlSessionFactory orderSqlSessionFactory(@Qualifier(DataSources.TRAIN_ORDER_DB) DataSource orderDB) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(orderDB);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:orderMappers/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "orderSqlSessionTemplate")
    public SqlSessionTemplate orderSqlSessionTemplate(@Qualifier("orderSqlSessionFactory") SqlSessionFactory orderSqlSessionFactory){
        return new SqlSessionTemplate(orderSqlSessionFactory);
    }
}
