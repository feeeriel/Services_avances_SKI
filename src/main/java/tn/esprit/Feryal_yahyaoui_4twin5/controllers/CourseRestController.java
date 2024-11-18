package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Course;
import tn.esprit.Feryal_yahyaoui_4twin5.repositories.ICourseRepository;
import tn.esprit.Feryal_yahyaoui_4twin5.services.ICourseServices;

import java.util.List;

@RequiredArgsConstructor
@Tag(name = "Gestion course")
@RequestMapping("/course")
 @RestController
public class CourseRestController {
    @Autowired
    private final ICourseServices courseServices;
    @Operation(description = "ajout course")
    @PostMapping("/add")
    public Course saveCourse(@RequestBody Course course) {
        return courseServices.addCourse(course);
    }
    @Operation(description = "get course")
    @GetMapping("/get/{numcourse}")
    public Course getCourse(@PathVariable Long numcourse) {
        return courseServices.retrieveCourse(numcourse);
    }
    @Operation(description = "update course")
    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course) {
        return courseServices.updateCourse(course);
    }
    @Operation(description = "get all course")
    @GetMapping("/getall")
    public List<Course> getAllCourses() {
        return courseServices.retrieveAll();
    }

    @Operation(description = "efface course")
    @DeleteMapping("/delete/{numcourse}")
   public void deleteCourse(@PathVariable Long numcourse) {
        courseServices.removeCourse(numcourse);
    }


}
