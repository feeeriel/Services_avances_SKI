package tn.esprit.Feryal_yahyaoui_4twin5.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Course;
import tn.esprit.Feryal_yahyaoui_4twin5.repositories.ICourseRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class CourseServicesImpl implements ICourseServices{
    @Autowired
    private ICourseRepository courseRepository;
    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course retrieveCourse(Long numcourse) {
        return courseRepository.findById(numcourse).orElse(null);
    }

    @Override
    public List<Course> retrieveAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public void removeCourse(Long numcourse) {
        courseRepository.deleteById(numcourse);
    }
    @Override
    public Course findByNumcourse(Long numCourse) {
        return courseRepository.findByNumcourse(numCourse);
    }




}
