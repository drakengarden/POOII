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
    public List<Libro> getAll() throws SQLException {
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
            rs.close();
            ps.close();
            return libros;
        }
        finally {
            DataSource.getInstance().closeConnection(con);
        }
    }

    @Override
    public void insertLibro(Libro libro) throws Exception {
        Connection con = DataSource.getInstance().openConnection(); // open connection
        con.setAutoCommit(false); // doesn't commit twice
        final String LibroSQL = "INSERT INTO Libro (ID, NOMBRE, DESCRIPCION) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(LibroSQL); // store query for execution
        ps.setLong(1, libro.getId()); // input is inserted into parameters; par. num. are in final String
        ps.setString(2, libro.getNombre()); // getters are from lombok
        ps.setString(3, libro.getDescripcion()); // info comes from method argument 'libro'
        ps.execute(); // execute query after taking info from arguments
        con.commit();
        ps.close();
        con.close();
    }

    @Override
    public void borrarLibro(Libro libro) throws Exception{
        Connection con = DataSource.getInstance().openConnection();
        con.setAutoCommit(false);
        final String LibroSQL = "DELETE FROM Libro WHERE id=?";
        PreparedStatement ps = con.prepareStatement(LibroSQL);
        ps.setLong(1, libro.getId());
        ps.execute();
        con.commit();
        ps.close();
        con.close();
    }
}