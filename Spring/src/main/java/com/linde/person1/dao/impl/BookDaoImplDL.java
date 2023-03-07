package com.linde.person1.dao.impl;

import com.linde.person1.dao.BookDao;

public class BookDaoImplDL implements BookDao {

    private  String databaseName;
    private int connectionNum;

    public BookDaoImplDL(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("book dao save  "+"--"+databaseName+"---"+connectionNum);
    }
}
