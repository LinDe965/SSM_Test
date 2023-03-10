package com.linde.part1.dao.impl;

import com.linde.part1.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book dao save...   "+name);
    }

}
