package com.xzh.db;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sun.org.apache.regexp.internal.RE;
import io.shardingsphere.api.algorithm.masterslave.RoundRobinMasterSlaveLoadBalanceAlgorithm;
import io.shardingsphere.api.config.rule.MasterSlaveRuleConfiguration;
import io.shardingsphere.shardingjdbc.api.MasterSlaveDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

@Configuration
@MapperScan(basePackages = "com.xzh.dao", sqlSessionTemplateRef = "sqlSessionTemplate")
public class BasicDataSourceConfig {

    @Primary
    @Bean(name = DataSources.MASTER_DB)
    @ConfigurationProperties(prefix = "spring.datasource-master")
    public DataSource masterDB() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = DataSources.SLAVE_DB)
    @ConfigurationProperties(prefix = "spring.datasource-slave")
    public DataSource slaveDB() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "masterSlaveDataSource")
    public DataSource masterSlaveDataSource(@Qualifier(DataSources.MASTER_DB) DataSource masterDB,
                                            @Qualifier(DataSources.SLAVE_DB) DataSource slaveDB) throws SQLException {
        Map<String, DataSource> map = Maps.newHashMap();
        map.put(DataSources.MASTER_DB, masterDB);
        map.put(DataSources.SLAVE_DB, slaveDB);

        MasterSlaveRuleConfiguration masterSlaveRuleConfiguration = new MasterSlaveRuleConfiguration(
                "ds_master_slave", DataSources.MASTER_DB, Lists.newArrayList(DataSources.SLAVE_DB), new RoundRobinMasterSlaveLoadBalanceAlgorithm());
        return MasterSlaveDataSourceFactory.createDataSource(map, masterSlaveRuleConfiguration, Maps.newHashMap(), new Properties());
    }

    @Bean
    @Primary
    public DataSourceTransactionManager transactionManager(@Qualifier(DataSources.MASTER_DB) DataSource masterDB){
        return new DataSourceTransactionManager(masterDB);
    }

    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier(DataSources.MASTER_DB) DataSource masterDB) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(masterDB);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*.xml"));
        return bean.getObject();
    }

    @Bean("sqlSessionTemplate")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

