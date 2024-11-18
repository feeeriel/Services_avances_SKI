package tn.esprit.Feryal_yahyaoui_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.Support;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.TypeCourse;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numcourse;
    private int level ;
    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;
    private String price;
    @Enumerated(EnumType.STRING)
    private Support support;
    private int timeslot;

}
