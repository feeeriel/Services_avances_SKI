package tn.esprit.Feryal_yahyaoui_4twin5.services;

import tn.esprit.Feryal_yahyaoui_4twin5.entities.Course;

import java.util.List;

public interface ICourseServices {
    Course addCourse(Course course);
    Course updateCourse(Course course);
    Course retrieveCourse(Long numcourse);
    List<Course> retrieveAll();
    void removeCourse(Long numcourse);
    Course findByNumcourse(Long numcourse);

}
