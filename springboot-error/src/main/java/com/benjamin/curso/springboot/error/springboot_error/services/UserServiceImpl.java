package com.benjamin.curso.springboot.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benjamin.curso.springboot.error.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        User u = null;

        for (User user : users) {
            if (user.getId().equals(id)) {
                u = user;
                break;
            }
        }

        if (u == null) {
            return Optional.empty();
        }

        // este metodo devuelve la version null de un Optional
        return Optional.ofNullable(u);
    }
}
