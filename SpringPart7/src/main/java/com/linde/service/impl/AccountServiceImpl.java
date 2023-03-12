package com.linde.service.impl;

import com.linde.dao.AccountDao;
import com.linde.service.AccountService;
import com.linde.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    @Override
    public void transfer(String out, String in, int money) throws IOException {
        try{
            accountDao.outMoney(out,money);
/*        if (true){
            throw  new IOException();
        }*/
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);
        }

    }
}
