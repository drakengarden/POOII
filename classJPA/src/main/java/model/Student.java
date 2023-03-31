package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="STUDENT")
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(name = "Student.all", query = "SELECT e FROM Student e")
})

public class Student { // All entities are persistent; information is saved
    @Id
    @SequenceGenerator(name = "student_seq", sequenceName = "estudiante_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")

    private Long id;
    private String nombre;
    private String apellido;
}
