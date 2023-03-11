package com.linde.part1.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.linde.part1")
@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {
}
