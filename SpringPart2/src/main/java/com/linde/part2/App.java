package com.linde.part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextPart2.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource);
    }
}
