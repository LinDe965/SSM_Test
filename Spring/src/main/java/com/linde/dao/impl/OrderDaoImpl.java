package com.linde.dao.impl;

import com.linde.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("order dao save");
    }
}
