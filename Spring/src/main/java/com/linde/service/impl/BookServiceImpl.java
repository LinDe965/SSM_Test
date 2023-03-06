package com.linde.service.impl;

import com.linde.dao.BookDao;
import com.linde.dao.UserDao;
import com.linde.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save");
        bookDao.save();
        //userDao.save();
    }
}
