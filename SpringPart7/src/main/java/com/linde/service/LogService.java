package com.linde.service;

import org.springframework.transaction.annotation.Transactional;

public interface LogService {

    @Transactional
    void log(String out,String in,int money);
}
