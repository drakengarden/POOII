package com.uam.biblioteca.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="AUTHOR")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @SequenceGenerator(name="author_seq", sequenceName = "author_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_seq")
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Libro> detalles;
}
