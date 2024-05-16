package com.angel.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angel.curso.springboot.webapp.springbootweb.models.User;
import com.angel.curso.springboot.webapp.springbootweb.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")

public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        UserDto userDto = new UserDto();
        User user = new User("Angel", "Mansilla");
        userDto.setUser(user);
        userDto.setTittle("Hola mundo Spring Boot");
        
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Angel", "Mansilla");
        User user2 = new User("Carlos", "Anceloti");
        User user3 = new User("Pedro", "Castillo");

        List<User> users = Arrays.asList(user, user2, user3);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        
        return users;
    }
    
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User("Angel", "Mansilla");
        Map<String, Object> body = new HashMap<>();
        
        body.put("tittle", "Hola mundo Spring Boot");
        body.put("user", user);
        return body;
    }
}
