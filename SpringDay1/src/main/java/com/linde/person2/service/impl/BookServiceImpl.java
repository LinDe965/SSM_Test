package com.linde.person2.service.impl;

import com.linde.person2.dao.BookDao;
import com.linde.person2.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public void save() {
        System.out.println("book service save ....");
        bookDao.save();
    }
}
