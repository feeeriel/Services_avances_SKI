package tn.esprit.Feryal_yahyaoui_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Skier implements Serializable {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long numskier;
        @DateTimeFormat(pattern ="yyyy-mm-dd")
        private LocalDate birthDate;
        private String city;
        private String firstName;
        private String lastName;
        private int age;
        @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
        Subscription subscription;
        @OneToMany(mappedBy = "skier" ,fetch =FetchType.EAGER)
        Set<Registration> registrations;
        @ManyToMany(mappedBy = "skiers")
        Set<Piste> pistes;

}

