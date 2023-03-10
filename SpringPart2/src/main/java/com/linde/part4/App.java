package com.linde.part4;

import com.linde.part4.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextPart4.xml");
//        BookDao bookDao = context.getBean(BookDao.class);
//        bookDao.save();
    }
}
