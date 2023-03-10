package com.linde.person2.dao.impl;

import com.linde.person2.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ....");
    }
}
