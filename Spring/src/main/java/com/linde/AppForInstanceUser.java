package com.linde;

import com.linde.dao.UserDao;
import com.linde.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao2");
        userDao.save();
    }
}
