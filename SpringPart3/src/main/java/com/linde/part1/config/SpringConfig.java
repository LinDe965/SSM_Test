package com.linde.part1.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.linde.part1")
@PropertySource("name.properties")
public class SpringConfig {
}
