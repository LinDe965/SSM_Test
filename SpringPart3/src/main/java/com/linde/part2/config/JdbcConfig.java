package com.linde.part2.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {

    @Value("com.mysql.cj.jdbc.Driver")
    private String  driver;
    @Value("jdbc:mysql://localhost:3306/ssm")
    private String  url;
    @Value("root")
    private String  username;
    @Value("123456")
    private String  password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return  dataSource;
    }

}
