package com.benjamin.curso.springboot.app.aop.springboot_aop.controllers;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.benjamin.curso.springboot.app.aop.springboot_aop.services.GreetingService;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/")
    public ResponseEntity<?> greeting() {

        return ResponseEntity.ok(Collections.singletonMap("greeting",
                greetingService.sayHello("Rana Pepegrillo Vergara", "Wena cabros")));
    }

    @GetMapping("/error")
    public ResponseEntity<?> greetingError() {

        return ResponseEntity.ok(Collections.singletonMap("greeting",
                greetingService.sayHelloError("Rana Pepegrillo Vergara", "Wena cabros")));
    }
}
