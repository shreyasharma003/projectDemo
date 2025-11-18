package com.flipr.demo.controller;

import com.flipr.demo.entity.Subscription;
import com.flipr.demo.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subscribe")
@CrossOrigin(origins = "*")
public class SubscriptionController {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @GetMapping
    public List<Subscription> getSubscribers() {
        return subscriptionRepository.findAll();
    }

    @PostMapping
    public Subscription addSubscriber(@RequestBody Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }
}
