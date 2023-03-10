package com.linde.part1.service.impl;

import com.linde.part1.dao.BookDao;
import com.linde.part1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book Service save ....");
        bookDao.save();
    }
}
