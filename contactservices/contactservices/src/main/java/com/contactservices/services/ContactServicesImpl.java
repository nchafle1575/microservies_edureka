package com.contactservices.services;


import com.contactservices.entities.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServicesImpl implements ContactServices {

            //fake contact list
            List<Contact> list = List.of(
            new Contact(12L, "nan@nan.com","nan", 1312L),
            new Contact(13L, "teja@teja.com","tej", 1314L),
            new Contact(14L, "sup@sup.com","sup", 1311L),
            new Contact(15L, "san@san.com","san", 1311L)

    );

    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}