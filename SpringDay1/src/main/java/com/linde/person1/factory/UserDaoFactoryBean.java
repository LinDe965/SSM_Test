package com.linde.person1.factory;

import com.linde.person1.dao.UserDao;
import com.linde.person1.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    //对象是否为单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
