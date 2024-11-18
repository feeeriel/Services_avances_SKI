package tn.esprit.Feryal_yahyaoui_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Piste;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.Color;

import java.util.List;

public interface IPisteRepository extends CrudRepository<Piste, Long> {
    List<Piste> findPisteByColor(Color color);
}
