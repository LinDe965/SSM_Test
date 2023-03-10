package com.linde.part2.dao.impl;

import com.linde.part2.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...   ");
    }

}
