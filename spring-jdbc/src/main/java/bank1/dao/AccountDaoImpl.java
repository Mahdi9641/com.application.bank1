package bank1.dao;

import bank1.mapper.AccountRowMapper;
import bank1.model.Account;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
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

