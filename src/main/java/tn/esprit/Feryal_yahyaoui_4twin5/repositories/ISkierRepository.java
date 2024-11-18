package tn.esprit.Feryal_yahyaoui_4twin5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Skier;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.TypeSubscription;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface ISkierRepository extends CrudRepository<Skier,Long> {

    Skier findByFirstNameAndLastName(String firstName, String lastname);
    Set<Skier> findByBirthDate(LocalDate birthDate);
    Skier findSkierByNumskier(Long numskier);
    List<Skier> findSkierByFirstNameAndLastName(String firstName, String lastName);
    List<Skier> findBySubscription_TypeSub(TypeSubscription typeSub);
}
