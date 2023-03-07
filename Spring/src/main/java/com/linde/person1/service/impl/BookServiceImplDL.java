package com.linde.person1.service.impl;

import com.linde.person1.dao.BookDao;
import com.linde.person1.dao.UserDao;
import com.linde.person1.service.BookService;

public class BookServiceImplDL implements BookService {

    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImplDL(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save");
        bookDao.save();
        userDao.save();
    }
}
