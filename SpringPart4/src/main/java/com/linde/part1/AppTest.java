package com.linde.part1;

import com.linde.part.domain.Account;
import com.linde.part1.config.SpringConfig;
import com.linde.part1.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = applicationContext.getBean(AccountService.class);
        Account byId = accountService.findById(1);
        System.out.println(byId);
    }
}
