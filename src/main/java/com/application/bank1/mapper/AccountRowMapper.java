package com.application.bank1.mapper;

import com.application.bank1.model.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account =new Account(rs.getLong("accountNumber"),rs.getLong("accountBalance"));
        return account;
    }
}
