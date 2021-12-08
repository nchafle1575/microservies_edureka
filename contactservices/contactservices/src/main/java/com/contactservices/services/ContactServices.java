package com.contactservices.services;

import com.contactservices.entities.Contact;

import java.util.List;

public interface ContactServices {

//    public Contact getContact(long cId) ;
    public List<Contact> getContactOfUser(Long userId);
}
