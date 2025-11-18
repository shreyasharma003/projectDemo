package com.flipr.demo.controller;

import com.flipr.demo.entity.ContactForm;
import com.flipr.demo.repository.ContactFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin
public class ContactFormController {

    @Autowired
    private ContactFormRepository contactFormRepository;

    @GetMapping
    public List<ContactForm> getMessages() {
        return contactFormRepository.findAll();
    }

    @PostMapping
    public ContactForm saveMessage(@RequestBody ContactForm contactForm) {
        return contactFormRepository.save(contactForm);
    }
}
