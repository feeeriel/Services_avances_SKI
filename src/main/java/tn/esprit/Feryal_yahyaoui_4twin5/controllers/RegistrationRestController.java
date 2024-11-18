package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Course;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Piste;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Registration;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Skier;
import tn.esprit.Feryal_yahyaoui_4twin5.services.CourseServicesImpl;
import tn.esprit.Feryal_yahyaoui_4twin5.services.RegistrationServicesImpl;
import tn.esprit.Feryal_yahyaoui_4twin5.services.SkierServicesImpl;

import java.util.List;

@RequiredArgsConstructor
@Tag(name = "Gestion registration")
@RequestMapping("registration")
@RestController
public class RegistrationRestController {
    @Autowired
    private final RegistrationServicesImpl  registrationServices;
    @Autowired
    private SkierServicesImpl skierServicesImpl;
    private CourseServicesImpl courseServicesImpl;
    @Operation(description = "ajout registration")
    @PostMapping("/add")
    public Registration saveRegistration(@RequestBody Registration registration) {
        return registrationServices.addRegistration(registration);
    }
    @Operation(description = "get registration")
    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration) {
        return registrationServices.retrieveRegistration(numRegistration);
    }
    @Operation(description = "efface registration")
    @DeleteMapping("/delete/{numRegistration}")
    public void deleteSkier(@PathVariable Long numRegistration){
        registrationServices.removeRegistration(numRegistration);
    }
    @Operation(description = "update registration")
    @PutMapping("/update")
    public Registration updateRegistration(@RequestBody Registration registration) {
        return registrationServices.updateRegistration(registration);
    }
    @Operation(description = "ajout registration et attribuer au skier")
    @PostMapping("/addskier/{numskier}")
    public Registration addRegistrationAndAssignToSkier(@RequestBody Registration registration,@PathVariable Long numskier) {
     Skier skier=skierServicesImpl.findSkierByNumskier(numskier);
     registration.setSkier(skier);
     return registrationServices.addRegistration(registration);
    }
    @Operation(description = "get all registration")
    @GetMapping("/getall")
    public List<Registration> getAllRegistrations() {
        return registrationServices.retrieveAll();
    }
    @Operation(description = "add registration et attribuer au course")
    @PostMapping("/addcourse/{numcourse}")
    public Registration addRegistrationAndAssignToCourse(@RequestBody Registration registration,@PathVariable Long numcourse) {
        return registrationServices.addRegistrationAndAssignToCourse(registration,numcourse);
        }

}

