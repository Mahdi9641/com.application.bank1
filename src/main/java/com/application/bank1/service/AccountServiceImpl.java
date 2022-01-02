package com.application.bank1.service;

import com.application.bank1.dao.Dao;
import com.application.bank1.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService{

    private Dao dao;

    public AccountServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<Account> findall() {

            return dao.findall();

    }
}
