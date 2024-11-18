package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Piste;
import tn.esprit.Feryal_yahyaoui_4twin5.services.PisteServicesImpl;

import java.util.List;

@RequiredArgsConstructor
@Tag(name = "Gestion piste")
@RequestMapping("piste")
@RestController
public class PisteRestController {
    @Autowired
    private final PisteServicesImpl pisteServices;
    @Operation(description = "ajout piste")
    @PostMapping("/add")
    public Piste savePiste(@RequestBody Piste piste) {
        return pisteServices.addPiste(piste);
    }
    @Operation(description = "get piste")
    @GetMapping("/get/{numPiste}")
    public Piste getPiste(@PathVariable Long numPiste) {
        return pisteServices.retrievePiste(numPiste);
    }
    @Operation(description = "get all piste")
    @GetMapping("/getall")
    public List<Piste> getAllPiste() {
        return pisteServices.retrieveAll();
    }
    @Operation(description = "update piste")
    @PutMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteServices.updatePiste(piste);
    }
    @Operation(description = "efface piste")
    @DeleteMapping("/delete/{numPiste}")
    public void deletePiste(@RequestBody Long numPiste) {
        pisteServices.removePiste(numPiste);
    }

}
