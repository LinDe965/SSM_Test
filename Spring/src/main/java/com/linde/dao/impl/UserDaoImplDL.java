package com.linde.dao.impl;

import com.linde.dao.UserDao;

public class UserDaoImplDL implements UserDao {
    @Override
    public void save() {
        System.out.println("User dao save");
    }
}
