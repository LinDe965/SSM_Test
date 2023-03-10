package com.linde.person1.dao.impl;

import com.linde.person1.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("order dao save");
    }
}
