package dao;
import java.util.List;

public interface IDAO { // crud
    <T> List<T> findAll(Class<T> clazz, String nameQuery); // class unknown; type unknown (T)
    <T> void create(T entity);
    <T> void delete(T entity);
    <T> void update(T entity);
    <T> T findById(Long id, Class<T> clazz);
}
