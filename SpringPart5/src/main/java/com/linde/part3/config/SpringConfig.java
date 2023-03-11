package com.linde.part3.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.linde.part3")
@EnableAspectJAutoProxy
public class SpringConfig {
}
