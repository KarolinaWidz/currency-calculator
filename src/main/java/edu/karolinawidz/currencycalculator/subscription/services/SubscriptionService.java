package edu.karolinawidz.currencycalculator.subscription.services;

import edu.karolinawidz.currencycalculator.subscription.model.Subscription;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubscriptionService {
    void createSubscription(Subscription subscription);

    void deleteSubscriptionById(Long id);

    List<Subscription> getAllSubscriptions();

    Subscription getSubscriptionById(Long id);
}
