package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Course;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Instructor;
import tn.esprit.Feryal_yahyaoui_4twin5.services.ICourseServices;
import tn.esprit.Feryal_yahyaoui_4twin5.services.IInstructorServices;

import java.util.List;

@RequiredArgsConstructor
@Tag(name = "Gestion instructor")
@RequestMapping("instructor")
@RestController

public class InstructorRestController {
    @Autowired
    private final IInstructorServices instructorServices;

    @Operation(description = "ajout instructor")
    @PostMapping("/add")
    public Instructor saveInstructor(@RequestBody Instructor instructor) {
        return instructorServices.addInstructor(instructor);
    }

    @Operation(description = "get instructor")
    @GetMapping("/get/{numInstructor}")
    public Instructor getInstructor(@PathVariable Long numInstructor) {
        return instructorServices.retrieveInstructor(numInstructor);
    }

    @Operation(description = "update instructor")
    @PutMapping("update")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorServices.updateInstructor(instructor);
    }

    @Operation(description = "get all instructor")
    @GetMapping("/getall")
    public List<Instructor> getAllInstructors() {
        return instructorServices.retrieveAll();
    }

    @Operation(description = "efface instructor")
    @DeleteMapping("/delete/{numInstructor}")
    public void deleteInstructor(@PathVariable Long numInstructor) {
        instructorServices.removeInstructor(numInstructor);
    }
    @PostMapping("/AddAndAssignToCourse/{numCourse}")
    public Instructor AddInstructorAndAssignToCourse(@RequestBody Instructor ins,@PathVariable List <Long> numCourse) {
        return instructorServices.AddInstructorAndAssignToCourse(ins,numCourse);
    }
    @PostMapping("/AddAndAssignToCourses")
    public Instructor AddAndAssignCourse(@RequestBody Instructor ins){
        return instructorServices.AddAndAssignCourse(ins);
    }

}

