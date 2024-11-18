package tn.esprit.Feryal_yahyaoui_4twin5.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Subscription;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.TypeSubscription;
import tn.esprit.Feryal_yahyaoui_4twin5.repositories.ISubscriptionRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SubscriptionServicesImpl implements ISubscriptionServices {
    @Autowired
    private ISubscriptionRepository subscriptionRepository;

    @Override
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long numSub) {
        return subscriptionRepository.findById(numSub).orElse(null);
    }

    @Override
    public List<Subscription> retrieveAll() {
        return (List<Subscription>) subscriptionRepository.findAll();
    }

    @Override
    public void removeSubscription(long numSub) {
        subscriptionRepository.deleteById(numSub);
    }

    @Override
    public Set<Subscription> getSubscriptionByType(TypeSubscription type) {
        return subscriptionRepository.findByTypeSubOrderByStartDate(type);
    }


}
