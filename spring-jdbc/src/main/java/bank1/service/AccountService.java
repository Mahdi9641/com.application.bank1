package bank1.service;

import bank1.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> findall();

    void insert(Account account);

    void update(Account account);

    void delete(Account account);
}
