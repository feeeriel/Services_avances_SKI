package tn.esprit.Feryal_yahyaoui_4twin5.services;

import tn.esprit.Feryal_yahyaoui_4twin5.entities.Piste;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.Color;

import java.util.List;

public interface IPisteServices {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    Piste retrievePiste(Long numPiste);
    List<Piste> retrieveAll();
   void removePiste(long numPiste);

}
