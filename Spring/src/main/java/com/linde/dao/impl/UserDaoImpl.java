package com.linde.dao.impl;

import com.linde.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("User dao save");
    }
}
