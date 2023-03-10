package com.linde.person1.factory;

import com.linde.person1.dao.UserDao;
import com.linde.person1.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
