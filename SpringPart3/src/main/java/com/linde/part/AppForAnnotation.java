package com.linde.part;

import com.linde.part.config.SpringConfig;
import com.linde.part.dao.BookDao;
import com.linde.part.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        BookDao bookDao1 = context.getBean(BookDao.class);
        System.out.println(bookDao);
        System.out.println(bookDao1);

        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService);
        context.close();
    }
}
