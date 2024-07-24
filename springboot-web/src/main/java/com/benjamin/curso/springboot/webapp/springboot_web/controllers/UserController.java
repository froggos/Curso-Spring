package com.benjamin.curso.springboot.webapp.springboot_web.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.benjamin.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Sapo", "Santana LeBlanc");
        user.setEmail("benja.v.o@hotmail.com");

        model.addAttribute("title", "Wena cabros");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Listado de usuarios");

        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        List<User> users = Arrays.asList(new User("Rain", "Gonzales", "rain@gmail.com"),
                new User("Reina", "Lopez"),
                new User("Roberto", "El que", "tedejo@gmail.com"));

        return users;
    }
}
