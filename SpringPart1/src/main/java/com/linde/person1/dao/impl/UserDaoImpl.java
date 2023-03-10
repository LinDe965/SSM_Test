package com.linde.person1.dao.impl;

import com.linde.person1.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("User dao save");
    }
}
