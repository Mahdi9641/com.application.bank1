package com.application.bank1.mapper;

import com.application.bank1.model.Transaction;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionRowMapper implements RowMapper<Transaction> {

    @Override
    public Transaction mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Transaction transaction = new Transaction(resultSet.getLong("id"),resultSet.getInt("amount"));
        return transaction;
    }
}
