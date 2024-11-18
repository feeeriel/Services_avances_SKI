package tn.esprit.Feryal_yahyaoui_4twin5.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Course;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Registration;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Skier;
import tn.esprit.Feryal_yahyaoui_4twin5.repositories.ICourseRepository;
import tn.esprit.Feryal_yahyaoui_4twin5.repositories.IRegistrationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class RegistrationServicesImpl implements IRegistrationServices {
    @Autowired
    private IRegistrationRepository registrationRepository;
    private ICourseRepository courseRepository;

    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return registrationRepository.findById(numRegistration).orElse(null);
    }

    @Override
    public List<Registration> retrieveAll() {
        return (List<Registration>) registrationRepository.findAll();
    }

    @Override
    public void removeRegistration(long numRegistration) {
        registrationRepository.deleteById(numRegistration);
    }
    public Registration addRegistrationAndAssignToSkier(Registration registration, Long numskier) {
        return null;
    }
    public Registration addRegistrationAndAssignToCourse(Registration registration, Long numcourse) {
        Course course = courseRepository.findById(numcourse).orElse(null);
        registration.setCourse(course);
        return registrationRepository.save(registration);
    }

}
