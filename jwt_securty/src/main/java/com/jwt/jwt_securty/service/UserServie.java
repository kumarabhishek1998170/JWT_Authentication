package com.jwt.jwt_securty.service;

import com.jwt.jwt_securty.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServie {
    UserServie(){
         this.store.add(new User("abhi", UUID.randomUUID().toString(),"a@gmail.com"));
         this.store.add(new User(",mayank",UUID.randomUUID().toString(),"mayank@gmail.com"));
         this.store.add(new User("priyanshu",UUID.randomUUID().toString(),"priyanshu@gmail.com"));
    }
    private List<User> store = new ArrayList<>();

    public List<User> getUsers(){
        return this.store;
    }


}
