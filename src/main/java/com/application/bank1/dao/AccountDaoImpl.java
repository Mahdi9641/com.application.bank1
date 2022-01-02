package com.application.bank1.dao;

import com.application.bank1.mapper.AccountRowMapper;
import com.application.bank1.model.Account;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class AccountDaoImpl implements Dao<Account> {

    @Override
    public List<Account> findall() {
        return tempelate.query("select * from account", new AccountRowMapper());
    }
    private NamedParameterJdbcTemplate tempelate;
    public AccountDaoImpl(NamedParameterJdbcTemplate tempelate) {
        this.tempelate = tempelate;
    }
}

