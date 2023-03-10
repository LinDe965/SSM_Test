package com.linde.part6.service.impl;

import com.linde.part6.dao.BookDao;
import com.linde.part6.service.BookService;
import org.springframework.stereotype.Service;

//@Component
@Service
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
