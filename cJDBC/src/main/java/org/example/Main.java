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
    public static void main(String[] args) throws Exception {
        List<Libro> libros = new ArrayList<>();
        IServiceLibro service = new ImpServiceLibro();
        libros = service.getAll();
        System.out.println("Seleccionar:");
        System.out.println(libros.toString());

        System.out.println();
        System.out.println("Insertar:");
        service.insertLibro(new Libro(2L, "100 Años", "GGM"));
        libros = service.getAll();
        System.out.println(libros.toString());

        System.out.println();
        System.out.println("Borrar");
        service.borrarLibro(new Libro(2L, "X", "Y")); // doesn't take other parameters into account
        libros = service.getAll();
        System.out.println(libros.toString());
    }
}