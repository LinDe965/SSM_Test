package com.linde.person1;

import com.linde.person1.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) context.getBean("orderDao");
        orderDao.save();
    }
}
