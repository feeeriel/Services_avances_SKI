package tn.esprit.Feryal_yahyaoui_4twin5.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Course;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Instructor;
import tn.esprit.Feryal_yahyaoui_4twin5.repositories.ICourseRepository;
import tn.esprit.Feryal_yahyaoui_4twin5.repositories.IInstructorRepository;

import java.util.*;

@Service
@AllArgsConstructor
public class InstructorServicesImpl implements IInstructorServices {
    @Autowired
    private IInstructorRepository instructorRepository;
    private ICourseRepository courseRepository;

    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return instructorRepository.findById(numInstructor).orElse(null);
    }

    @Override
    public List<Instructor> retrieveAll() {
        return (List<Instructor>) instructorRepository.findAll();
    }

    @Override
    public void removeInstructor(long numInstructor) {
        instructorRepository.deleteById(numInstructor);
    }

    @Override
    public Instructor AddInstructorAndAssignToCourse(Instructor ins, List<Long> numCourses) {
        List<Course> courses = (List<Course>) courseRepository.findAllById(numCourses);
        for (Course course : courses) {
            ins.getCourses().add(course);
        }
        return instructorRepository.save(ins);
    }

    @Override
    public Instructor AddAndAssignCourse(Instructor ins) {
        Set<Course> courseList= ins.getCourses();
        Set<Course> courses = new HashSet<Course>();
        for (Course course : courseList) {
            course=courseRepository.findById(course.getNumcourse()).orElse(null);
            courses.add(course);
        }
        ins.setCourses(courses);
        return instructorRepository.save(ins);
    }

}
