package com.usersevices.userservices.services;

import com.usersevices.userservices.entites.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list
    List<User> list= List.of(
            new User(1311L, "Nandkishor", "2134"),
            new User(1312L, "Suprit", "124578"),
            new User(1314L, "Teja", "2134466")

    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
