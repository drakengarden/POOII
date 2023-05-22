package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="AUTHOR")
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(name = "Author.all", query = "select e from Author e") // all possible queries
})
public class Author {
    @Id
    private Long id;
    private String nombre;
}
