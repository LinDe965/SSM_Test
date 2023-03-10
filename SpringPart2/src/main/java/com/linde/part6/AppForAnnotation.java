package com.linde.part6;

import com.linde.part6.config.SpringConfig;
import com.linde.part6.dao.BookDao;
import com.linde.part6.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService);
    }
}
