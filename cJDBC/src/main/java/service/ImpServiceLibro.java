package service;
import model.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImpServiceLibro implements IServiceLibro {
    @Override
    public List<Libro> getAll() {
        Connection con = null;
        String libroSQL = "SELECT * FROM Libro";
        List<Libro> libros = new ArrayList<>();
        try {
            con = DataSource.getInstance().openConnection(); // singleton
            PreparedStatement ps = con.prepareStatement(libroSQL); // executes from database; not yet compiled
            ResultSet rs = ps.executeQuery(); // points to the table where the results will be stored
            while (rs.next()) { // rs.next points to an individual result of the query
                Libro libro = new Libro();
                libro.setDescripcion(rs.getString("descripcion"));
                libro.setNombre(rs.getString("nombre"));
                libro.setId(rs.getLong("id"));
                libros.add(libro);
            }
        }
        catch (SQLException e) {
            e.printStackTrace(); // prints every error of exception e
            return null;
        }
        catch (Exception e) {}
        finally {
            DataSource.getInstance().closeConnection(con);
        }
        return null;
    }

    @Override
    public void insertLibro(Libro libro) {

    }

    @Override
    public void borrarLibro(Libro libro) {

    }
}