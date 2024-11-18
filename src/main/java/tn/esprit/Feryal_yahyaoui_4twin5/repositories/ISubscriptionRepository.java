package tn.esprit.Feryal_yahyaoui_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Subscription;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionRepository extends CrudRepository<Subscription, Long> {
Set<Subscription> findByTypeSubOrderByStartDate(TypeSubscription typeSub);
}
