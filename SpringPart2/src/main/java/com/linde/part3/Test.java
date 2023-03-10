package com.linde.part3;

import com.linde.part3.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextPart3.xml");
//        DataSource dataSource = (DataSource) context.getBean("dataSource");
//        System.out.println(dataSource);
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
    }
}
