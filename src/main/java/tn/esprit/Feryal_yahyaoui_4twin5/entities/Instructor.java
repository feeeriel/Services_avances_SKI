package tn.esprit.Feryal_yahyaoui_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numinstructor;
    private String firstName;
    private String lastName;
    private LocalDate dateOfHire;
    @OneToMany
    Set<Course> courses;
}
