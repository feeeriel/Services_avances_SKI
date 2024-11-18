package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Skier;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.Color;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.TypeSubscription;
import tn.esprit.Feryal_yahyaoui_4twin5.services.ISkierServices;
import tn.esprit.Feryal_yahyaoui_4twin5.services.SkierServicesImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@RequiredArgsConstructor
@Tag(name = "Gestion skier")
@RequestMapping("skier")
@RestController
public class SkierRestController {

    private final ISkierServices skierService;
    @Operation(description = "ajout skier")
    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier){
        return skierService.addSkier(skier);
    }

    @Operation(description = "update skier par numskier")
    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier){
        return  skierService.retrieveSkier(numSkier);
    }
    @Operation(description = "efface skier")
    @DeleteMapping("/delete/{numSkier}")
    public void deleteSkier(@PathVariable Long numSkier){
         skierService.removeSkier(numSkier);
    }
    @Operation(description = "update skier")
    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier){
        return skierService.updateSkier(skier);
    }
    @Operation(description = "attribuer skier au piste ")
    @PutMapping("/assignSkierToPiste/{numSkier}/{numPiste}")
    public void assignSkierToPiste(@PathVariable Long numSkier, @PathVariable Long numPiste){
        skierService.assignSkierToPiste(numSkier, numPiste);
    }
    @Operation(description = "get skier avec fn et ln")
    @GetMapping("/getBy/{firstname}/{lastname}")
        public Skier getSkierByFirstnameAndLastname(@PathVariable String firstname, @PathVariable String lastname){
        return skierService.getByFirstNameAndLastName(firstname, lastname);
    }
    @Operation(description = "get skier  par birthdate")
    @GetMapping("/getBy/{birthDate}")
        public Set<Skier> getByBirthDate(@PathVariable @DateTimeFormat(pattern ="yyyy-mm-dd") LocalDate birthDate){
        return skierService.getByBirthDate(birthDate);
    }
    @Operation(description = "get all skier")
    @GetMapping("/getall")
    public List<Skier> getAllSkier(){
        return skierService.retrieveAll();
    }

    @Operation(description = "attribuer skier au piste fn et ln")
    @PostMapping("/assignSkierPiste/{firstName}/{lastName}/{color}")
    public List<Skier> assignSkierToPiste(@PathVariable String firstName, @PathVariable String lastName, @PathVariable Color color){
        return skierService.assignSkierToPiste(firstName,lastName,color);
    }
    @PostMapping("assignskiercourse/{numcourse}")
    public Skier addskiercourse(@RequestBody Skier skier,@PathVariable long numcourse){
        return skierService.addSkierAndAssignToCourse(skier,numcourse);

    }
    @GetMapping("/retrievebySubscriptionType/{typeSubscription}")
    public List<Skier> retrieveSkiersBySubscriptionType(@PathVariable TypeSubscription typeSubscription) {
        return skierService.findBySubscription_Typesub(typeSubscription);
    }
}


