package com.linde.part5;

import com.linde.part5.config.SpringConfig;
import com.linde.part5.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        String name = bookDao.findName(666,"SNNJBN");
        System.out.println(name);
    }
}
