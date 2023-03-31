package com.uam.biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="LIBRO")
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(name = "Libro.all", query = "select e from Libro e") // all possible queries
})
public class Libro {
    @Id
    private Long id;
    private String nombre;
}
