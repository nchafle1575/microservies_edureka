package com.contactservices.controller;
import com.contactservices.entities.Contact;
import com.contactservices.services.ContactServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact" )
public class ContactController {

    @Autowired
    public ContactServices contactService;

    @GetMapping("")
    public String displayMsg(){

        return "your on Contact microservies";
    }

    @GetMapping("/user/{userId}")
    public List getContact(@PathVariable("userId") Long userId) {

        return this.contactService.getContactOfUser(userId);
    }

}
