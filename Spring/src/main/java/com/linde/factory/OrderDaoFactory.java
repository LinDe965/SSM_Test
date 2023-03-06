package com.linde.factory;

import com.linde.dao.OrderDao;
import com.linde.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
