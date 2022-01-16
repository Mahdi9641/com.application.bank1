package bank1.service;

import bank1.model.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> findall();

    void insert(Transaction transaction);

    void update(Transaction transaction);

    void delete(Transaction transaction);

}
