package com.linde.part6.dao.impl;

import com.linde.part6.dao.BookDao;
import org.springframework.stereotype.Repository;

//@Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ....");
    }
}
