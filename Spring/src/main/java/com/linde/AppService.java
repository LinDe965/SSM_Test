package com.linde;

import com.linde.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppService {
    public static void main(String[] args) {
        //构造注入
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookServiceDL");
        bookService.save();

/*      setter注入
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();*/
    }
}
