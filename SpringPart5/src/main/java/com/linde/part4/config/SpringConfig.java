package com.linde.part4.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.linde.part4")
@Import({JdbcConfig.class, MybatisConfig.class})
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
public class SpringConfig {
}
