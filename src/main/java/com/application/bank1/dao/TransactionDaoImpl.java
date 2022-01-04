package com.application.bank1.dao;

import com.application.bank1.mapper.TransactionRowMapper;
import com.application.bank1.model.Transaction;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionDaoImpl implements Dao<Transaction> {

    @Override
    public List<Transaction> findall() {
        return tempelate.query("select * from Transaction ", new TransactionRowMapper());
    }

    private NamedParameterJdbcTemplate tempelate;

    public TransactionDaoImpl(NamedParameterJdbcTemplate tempelate) {
        this.tempelate = tempelate;


    }
}



//    private NamedParameterJdbcTemplate tempelate;
//
//    public TransactionDaoImpl(NamedParameterJdbcTemplate tempelate) {
//        this.tempelate = tempelate;
//    }
//
//    @Override
//    public List findall() {
//        return tempelate.query("select * from account", new AccountRowMapper());
//    }
//
//    @Override
//    public List<Transaction> findall2() {
//        return tempelate.query("select * from Transaction" , new TransactionRowMapper());
//    }
//}

