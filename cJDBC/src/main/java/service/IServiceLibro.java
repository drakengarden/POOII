package service;
import model.Libro;

import java.sql.SQLException;
import java.util.List;

public interface IServiceLibro {
    public List<Libro> getAll() throws SQLException; // unique unordered
    public void insertLibro(Libro libro);
    public void borrarLibro(Libro libro);
}