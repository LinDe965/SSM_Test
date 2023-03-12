package com.linde.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface AccountService {

//    @Transactional(rollbackFor = {IOException.class})
    @Transactional
    public void transfer(String out ,String in , int money) throws IOException;
}
