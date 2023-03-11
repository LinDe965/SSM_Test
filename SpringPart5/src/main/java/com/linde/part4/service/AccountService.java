package com.linde.part4.service;

import com.linde.part4.domain.Account;

import java.util.List;

public interface AccountService {
    public void save(Account account);

    public void update(Account account);

    public void delete(Integer id);

    public Account findById(Integer id);

    public List<Account> findAll();
}
