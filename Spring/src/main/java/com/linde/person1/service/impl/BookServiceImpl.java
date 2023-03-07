package com.linde.person1.service.impl;

import com.linde.person1.dao.BookDao;
import com.linde.person1.dao.UserDao;
import com.linde.person1.service.BookService;

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
