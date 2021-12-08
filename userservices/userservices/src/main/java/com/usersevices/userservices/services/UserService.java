package com.usersevices.userservices.services;

import com.usersevices.userservices.entites.User;
import org.springframework.stereotype.Service;



public interface UserService {

    public User getUser(Long id);

}
