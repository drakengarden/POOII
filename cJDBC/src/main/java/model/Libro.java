package model;
import lombok.Data;

@Data // get, set, constructors, hash, equals (these determine if an instance is unique w/ composite key)
public class Libro { // annotations: @name
    private Long id;
    private String nombre;
    private String descripcion;
}