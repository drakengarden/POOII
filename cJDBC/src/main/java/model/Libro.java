package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get, set, constructors, hash, equals (these determine if an instance is unique w/ composite key)
@AllArgsConstructor
@NoArgsConstructor

public class Libro { // annotations: @name
    private Long id;
    private String nombre;
    private String descripcion;
}
