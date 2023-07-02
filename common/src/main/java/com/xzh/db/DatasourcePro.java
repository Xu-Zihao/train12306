package com.xzh.db;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasour")
@Component
@Data
public class DatasourcePro {
    private String jdbcUrl;

    private String username;

    private String password;

    // 配置文件中是driver-class-name, 转驼峰命名便可以绑定成
    private String driverClassName;

    private String type;


}
