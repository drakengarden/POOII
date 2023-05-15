package com.uam.biblioteca.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;

@Entity
@Table(name="EDITORIAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Editorial {
    @Id
    @SequenceGenerator(name="editorial_seq", sequenceName = "editorial_sql", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "editorial_seq")
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "editorial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Libro> detalles;
}
