package com.linde.service.impl;

import com.linde.dao.AccountDao;
import com.linde.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String out, String in, int money) {
        accountDao.inMoney(in,money);
//        int i = 1/0;
        accountDao.outMoney(out,money);
    }
}
