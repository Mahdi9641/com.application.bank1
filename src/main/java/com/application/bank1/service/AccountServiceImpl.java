package com.application.bank1.service;

import com.application.bank1.dao.Dao;
import com.application.bank1.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService{

   private Dao<Account> accountDao;

    public AccountServiceImpl(Dao<Account> accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findall() {

            return accountDao.findall();

    }
}
