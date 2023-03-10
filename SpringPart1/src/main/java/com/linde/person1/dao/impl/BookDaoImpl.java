package com.linde.person1.dao.impl;

import com.linde.person1.dao.BookDao;

public class BookDaoImpl implements BookDao {

//    public BookDaoImpl(){
//        System.out.println("book dao constructor is running");
//    }

    private int connectionNum;
    private  String databaseName;

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("book dao save"+"--"+databaseName+"---"+connectionNum);
    }
}
