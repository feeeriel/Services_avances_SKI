package tn.esprit.Feryal_yahyaoui_4twin5.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Piste;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.Color;
import tn.esprit.Feryal_yahyaoui_4twin5.repositories.IPisteRepository;
import tn.esprit.Feryal_yahyaoui_4twin5.repositories.ISkierRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServicesImpl implements IPisteServices{
    @Autowired
    private IPisteRepository pisteRepository;

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public List<Piste> retrieveAll() {
        return (List<Piste>) pisteRepository.findAll();
    }

    @Override
    public void removePiste(long numPiste) {
        pisteRepository.deleteById(numPiste);
    }

}
