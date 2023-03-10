package com.linde.part.service.impl;

import com.linde.part.dao.BookDao;
import com.linde.part.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book Service save ....");
    }
}
