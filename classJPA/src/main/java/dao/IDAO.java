package dao;
import java.util.List;

public interface IDAO { // crud
    <T> List<T> findAll(Class clazz); // class unknown; type unknown (T)
    <T> void save(T entity);
    <T> void delete(T entity);
}
