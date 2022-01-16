package bank1.dao;

import bank1.mapper.TransactionRowMapper;
import bank1.model.Transaction;
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
public class TransactionDaoImpl implements Dao<Transaction> {

    @Override
    public List<Transaction> findall() {
        return tempelate.query("select * from Transaction ", new TransactionRowMapper());
    }

    private NamedParameterJdbcTemplate tempelate;

    public TransactionDaoImpl(NamedParameterJdbcTemplate tempelate) {
        this.tempelate = tempelate;
    }

    @Override
    public void insert(Transaction transaction) {
        String sql = "insert into transaction(id , amount) values(:id, :amount) ";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", transaction.getId())
                .addValue("amount", transaction.getAmount());
        tempelate.update(sql , param );
    }

    @Override
    public void update(Transaction transaction) {
        String sql = "update transaction set amount=:amount  where id = :id";

        Map<String , Object> map = new HashMap<>();
        map.put("id",transaction.getId());
        map.put("amount",transaction.getAmount());

        tempelate.execute(sql, map, new PreparedStatementCallback<Object>() {

            @Override
            public Object doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                return preparedStatement.executeUpdate();
            }
        });
    }

    @Override
    public void delete(Transaction transaction) {

        String sql = "delete from transaction where id=:id";
        Map<String , Object> map = new HashMap<>();
        map.put("id",transaction.getId());

        tempelate.execute(sql , map , new PreparedStatementCallback<Object>(){

            @Override
            public Object doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                return preparedStatement.executeUpdate();
            }
        });
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

