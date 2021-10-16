package edu.karolinawidz.currencycalculator.subscription.repository;

import edu.karolinawidz.currencycalculator.subscription.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
