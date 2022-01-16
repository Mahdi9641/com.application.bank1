package bank1.dao;

import java.util.List;

public interface Dao<T> {

    List<T> findall();


    void insert(T T);

    void update(T t);

    void delete(T t);

}
