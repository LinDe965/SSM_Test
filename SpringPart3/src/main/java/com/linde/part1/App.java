package com.linde.part1;

import com.linde.part1.config.SpringConfig;
import com.linde.part1.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = context.getBean(BookService.class);
        bookService.save();
    }
}
