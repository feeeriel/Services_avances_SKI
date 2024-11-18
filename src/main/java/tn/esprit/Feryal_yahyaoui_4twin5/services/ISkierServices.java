package tn.esprit.Feryal_yahyaoui_4twin5.services;

import tn.esprit.Feryal_yahyaoui_4twin5.entities.Piste;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Skier;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.Color;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.TypeSubscription;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface ISkierServices  {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    Skier retrieveSkier(Long numSkier);
    List<Skier> retrieveAll();
    void removeSkier(long numSkier);
    void assignSkierToPiste(Long numSkier, Long numPiste);
    Skier getByFirstNameAndLastName(String firstName, String lastName);
    Set<Skier> getByBirthDate(LocalDate birthDate);
    Skier findSkierByNumskier(Long numSkier);
    List<Skier> assignSkierToPiste(String firstName, String lastName, Color color);
    Skier addSkierAndAssignToCourse(Skier skier, Long numcourse);
    List<Skier> findBySubscription_Typesub(TypeSubscription typeSubscription);

}

