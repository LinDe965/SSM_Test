package com.linde;

import com.linde.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
}
