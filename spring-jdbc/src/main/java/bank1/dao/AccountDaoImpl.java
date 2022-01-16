package bank1.dao;

import bank1.mapper.AccountRowMapper;
import bank1.model.Account;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    @Override
    public void insert(Account account) {
        String sql = "insert into account(id , accountNumber , accountBalance) values (:id , :accountNumber , :accountBalance)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id" , account.getId())
                .addValue("accountNumber", account.getAccountNumber())
                .addValue("accountBalance", account.getAccountBalance());

        tempelate.update(sql, param);

    }

    @Override
    public void update(Account account) {
        String sql = "update account set accountNumber=:accountNumber ,  accountBalance=:accountBalance  where id = :id";

        Map<String, Object> map = new HashMap<>();
        map.put("id" , account.getId());
        map.put("accountNumber", account.getAccountNumber());
        map.put("accountBalance", account.getAccountBalance());

        tempelate.execute(sql, map, new PreparedStatementCallback<Object>() {

            @Override
            public Object doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                return preparedStatement.executeUpdate();
            }
        });
    }

    @Override
    public void delete(Account account) {
        String sql = "delete from account where id=:id";
        Map<String , Object> map = new HashMap<>();
        map.put("id",account.getId());

        tempelate.execute(sql , map , new PreparedStatementCallback<Object>(){

            @Override
            public Object doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                return preparedStatement.executeUpdate();
            }
        });

    }

}