package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="AUTHOR")
public class Author {
    @Id
    private Long id;
    private String nombre;
}
