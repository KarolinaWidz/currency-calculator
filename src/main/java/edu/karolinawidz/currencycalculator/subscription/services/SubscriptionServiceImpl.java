package edu.karolinawidz.currencycalculator.subscription.services;

import edu.karolinawidz.currencycalculator.subscription.model.Subscription;
import edu.karolinawidz.currencycalculator.subscription.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
class SubscriptionServiceImpl implements SubscriptionService {

    private final SubscriptionRepository repository;

    @Autowired
    SubscriptionServiceImpl(SubscriptionRepository repository) {
        this.repository = repository;
    }


    @Override
    public void createSubscription(Subscription subscription) {
        repository.save(subscription);
    }

    @Override
    public void deleteSubscriptionById(Long id) {
        Optional<Subscription> subscription = repository.findById(id);
        if (subscription.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Subscription not found");
        repository.deleteById(id);
    }

    @Override
    public List<Subscription> getAllSubscriptions() {
        return repository.findAll();
    }

    @Override
    public Subscription getSubscriptionById(Long id) {
        Optional<Subscription> subscription = repository.findById(id);
        if (subscription.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Subscription not found");
        return repository.getById(id);
    }
}
