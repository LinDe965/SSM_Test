package com.linde.service.impl;

import com.linde.dao.LogDao;
import com.linde.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;
    @Override
    public void log(String out, String in, int money) {
        logDao.log("转账操作由"+out+"到"+in+"，金额："+money+".0");
    }
}
