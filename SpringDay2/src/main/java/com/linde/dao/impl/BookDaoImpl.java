package com.linde.dao.impl;

import com.linde.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ....");
    }
}
