package com.linde.part1;

import com.linde.part1.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextPart1.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
    }
}
