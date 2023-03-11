package com.linde.part5.dao.impl;

import com.linde.part5.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id , String password) {
        System.out.println("id:"+id);
        return "Linde";
    }
}
