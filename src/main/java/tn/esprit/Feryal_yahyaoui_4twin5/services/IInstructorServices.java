package tn.esprit.Feryal_yahyaoui_4twin5.services;

import tn.esprit.Feryal_yahyaoui_4twin5.entities.Course;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Instructor;

import java.util.List;

public interface IInstructorServices {
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    Instructor retrieveInstructor(Long numInstructor);
    List<Instructor> retrieveAll();
    void removeInstructor(long numInstructor);
    Instructor AddInstructorAndAssignToCourse(Instructor ins,List<Long> numCourses);
    Instructor AddAndAssignCourse(Instructor ins);
}
