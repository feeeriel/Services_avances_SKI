package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Subscription;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.TypeSubscription;
import tn.esprit.Feryal_yahyaoui_4twin5.services.SubscriptionServicesImpl;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@RestController
@Tag(name = "Gestion subscription")
@RequestMapping("/subscription")
public class SubscriptionRestController {
    @Autowired
    private final SubscriptionServicesImpl subscriptionServices;
    @Operation(description = "ajout subscription")
    @PostMapping("/add") //
    public Subscription saveSubscription(@RequestBody Subscription subscription) {
        return subscriptionServices.addSubscription(subscription);
    }
    @Operation(description = "get subscription")
    @GetMapping("/get/{numSub}")
    public Subscription getSubscription(@PathVariable Long numSub) {
        return subscriptionServices.retrieveSubscription(numSub);
    }
    @Operation(description = "update subscription")
    @PutMapping("/update")
    public Subscription updateSubscription(@RequestBody Subscription subscription) {
        return subscriptionServices.updateSubscription(subscription);
    }
    @Operation(description = "get all subscription")
    @GetMapping("/getall")
    public List<Subscription> getAllSubscriptions() {
        return subscriptionServices.retrieveAll();
    }
    @Operation(description = "delete subscription")
    @DeleteMapping("/delete/{numSubscription}")
    public void deleteSubscription(@PathVariable Long numSubscription) {
        subscriptionServices.removeSubscription(numSubscription);
    }
    @Operation(description = "find subscription")
    @GetMapping("/findbysubscription/{type}")
    public Set<Subscription> findByType(@PathVariable TypeSubscription type) {
        return subscriptionServices.getSubscriptionByType(type);
    }



}
