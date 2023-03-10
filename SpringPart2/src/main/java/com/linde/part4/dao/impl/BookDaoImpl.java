package com.linde.part4.dao.impl;

import com.linde.part4.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("constructor");
    }

    @Override
    public void save() {
        System.out.println("book dao save ....");
    }
}
