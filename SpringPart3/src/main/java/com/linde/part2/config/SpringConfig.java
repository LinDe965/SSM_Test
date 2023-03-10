package com.linde.part2.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@Import({JdbcConfig.class})
@ComponentScan("com.linde.part2")
public class SpringConfig {



}
