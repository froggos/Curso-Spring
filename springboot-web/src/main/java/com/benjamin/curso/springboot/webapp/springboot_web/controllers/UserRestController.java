package com.benjamin.curso.springboot.webapp.springboot_web.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benjamin.curso.springboot.webapp.springboot_web.models.User;
import com.benjamin.curso.springboot.webapp.springboot_web.models.dot.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User("Sapo", "Santana LeBlanc");
        Map<String, Object> bodyMap = new HashMap<>();

        bodyMap.put("title", "Wena cabros");
        bodyMap.put("user", user);

        return bodyMap;
    }

    @GetMapping("/details-dto")
    public UserDto detailsDto() {
        UserDto userDto = new UserDto();
        User user = new User("Sapo", "Santana");

        userDto.setUser(user.getName());
        userDto.setLastname(user.getLastname());
        userDto.setTitle("Wena Cabros");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Sapo", "Santana");
        User user1 = new User("Santi", "Snake");
        User user2 = new User("Erwin", "Alfredo");

        // Este es otro metodo para generar un array
        List<User> users = Arrays.asList(user, user2, user1);

        // List<User> users = new ArrayList<User>();
        // users.add(user);
        // users.add(user1);
        // users.add(user2);

        return users;
    }
}
