package edu.karolinawidz.currencycalculator.subscription.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Subscription {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "Subscription name cannot be empty")
    private String subscriptionName;

    public Subscription() {
    }

    public Subscription(String userName) {
        this.subscriptionName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    @Override
    public String toString() {
        return "Follow{" +
                "id=" + id +
                ", userName='" + subscriptionName + '\'' +
                '}';
    }

}
