package tn.esprit.Feryal_yahyaoui_4twin5.services;

import tn.esprit.Feryal_yahyaoui_4twin5.entities.Subscription;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionServices {
    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    Subscription retrieveSubscription(Long numSub);
    List<Subscription> retrieveAll();
    void removeSubscription(long numSub);
    Set<Subscription> getSubscriptionByType(TypeSubscription type);

}
