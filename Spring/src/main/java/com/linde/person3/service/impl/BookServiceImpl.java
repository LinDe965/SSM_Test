package com.linde.person3.service.impl;

import com.linde.person3.dao.BookDao;
import com.linde.person3.service.BookService;

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
