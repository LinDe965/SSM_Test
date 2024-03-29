package com.linde.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.linde.controller","com.linde.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
