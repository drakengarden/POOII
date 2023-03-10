package service;
import model.Libro;
import java.util.List;

public interface IServiceLibro {
    public List<Libro> getAll(); // unique unordered
    public void insertLibro(Libro libro);
    public void borrarLibro(Libro libro);
}