package com.application.bank1.service;

import com.application.bank1.dao.Dao;
import com.application.bank1.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

 @Service
public class TransactionServiceImpl implements TransactionService{

    private Dao<Transaction> dao ;

     public TransactionServiceImpl(Dao<Transaction> dao) {
         this.dao = dao;
     }

     @Override
    public List<Transaction> findall() {
        return dao.findall();
    }
}
