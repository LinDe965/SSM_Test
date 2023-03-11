package com.linde.part3;

import com.linde.part3.config.SpringConfig;
import com.linde.part3.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        //bookDao.update();
        int select = bookDao.select();
        System.out.println(select);
    }
}
