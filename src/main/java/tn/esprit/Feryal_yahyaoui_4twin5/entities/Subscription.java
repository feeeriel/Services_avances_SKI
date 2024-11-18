package tn.esprit.Feryal_yahyaoui_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.TypeSubscription;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Subscription  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numsub;
    private LocalDate startDate;
    private LocalDate endDate;
    private float price;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;}