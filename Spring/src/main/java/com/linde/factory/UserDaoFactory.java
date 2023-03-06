package com.linde.factory;

import com.linde.dao.UserDao;
import com.linde.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
