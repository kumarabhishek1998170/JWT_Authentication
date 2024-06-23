package com.jwt.jwt_securty.controllers;

import com.jwt.jwt_securty.model.User;
import com.jwt.jwt_securty.service.UserServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;


@RestController
@RequestMapping("/home")
public class HomeController {

   @Autowired
    UserServie userService;
   @GetMapping("/users")
    private List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/currentUser")
    private String getCurrentUserName(Principal principal){
       return principal.getName();
    }

}
