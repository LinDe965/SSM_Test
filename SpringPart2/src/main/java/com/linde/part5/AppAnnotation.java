package com.linde.part5;

import com.linde.part5.dao.BookDao;
import com.linde.part5.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextPart5.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService=context.getBean(BookService.class);
        System.out.println(bookService);
    }
}
