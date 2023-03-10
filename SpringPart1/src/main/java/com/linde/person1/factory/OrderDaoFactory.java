package com.linde.person1.factory;

import com.linde.person1.dao.OrderDao;
import com.linde.person1.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
