package org.example;
import model.Libro;
import service.DataSource;
import service.ImpServiceLibro;
import service.IServiceLibro;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        List<Libro> libros = new ArrayList<>();
        IServiceLibro service = new ImpServiceLibro();
        libros = service.getAll();
        System.out.println(libros.toString());
    }
}