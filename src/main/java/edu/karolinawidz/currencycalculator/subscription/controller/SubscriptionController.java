package edu.karolinawidz.currencycalculator.subscription.controller;

import edu.karolinawidz.currencycalculator.subscription.model.Subscription;
import edu.karolinawidz.currencycalculator.subscription.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/subscriptions")
class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @Autowired
    SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping
    public ResponseEntity<List<Subscription>> getAllSubscriptions() {
        return new ResponseEntity<>(subscriptionService.getAllSubscriptions(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Subscription> getSubscriptionById(@PathVariable Long id) {
        return ResponseEntity.ok(subscriptionService.getSubscriptionById(id));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteSubscriptionById(@PathVariable Long id) {
        subscriptionService.deleteSubscriptionById(id);
        return new ResponseEntity<>("Subscription was deleted successfully", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createSubscription(@RequestBody @Valid Subscription subscription) {
        subscriptionService.createSubscription(subscription);
        return new ResponseEntity<>("Subscription was added successfully", HttpStatus.CREATED);
    }


}
