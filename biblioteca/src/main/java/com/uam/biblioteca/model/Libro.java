package com.uam.biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="libro")
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(name = "Libro.all", query = "select e from Libro e") // all possible queries
})
public class Libro {
    @Id
    @SequenceGenerator(name="libro_seq", sequenceName = "libro_sql", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libro_seq")
    private Long id;
    private String nombre;
}
