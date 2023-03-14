package com.linde.controller;

import com.linde.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save ---->"+book);
        return "{'module','book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        System.out.println("book getAll running");
        Book book = new Book();
        book.setName("计算机");
        book.setType("springmvc入门教程");
        book.setDescription("小试牛刀");

        Book book1 = new Book();
        book1.setName("计算机");
        book1.setType("springmvc实战教程");
        book1.setDescription("一代宗师");

        Book book2 = new Book();
        book2.setName("计算机");
        book2.setType("spring实战教程");
        book2.setDescription("一代宗师呕心创作");

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book2);
        return bookList;
    }
}
