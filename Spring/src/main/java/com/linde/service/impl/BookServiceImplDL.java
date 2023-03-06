package com.linde.service.impl;

import com.linde.dao.BookDao;
import com.linde.dao.UserDao;
import com.linde.dao.impl.BookDaoImplDL;
import com.linde.dao.impl.UserDaoImpl;
import com.linde.service.BookService;

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
