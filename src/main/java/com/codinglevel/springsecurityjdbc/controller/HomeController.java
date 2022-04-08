package com.codinglevel.springsecurityjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "Welcome to home page";
    }

    @GetMapping("/user")
    public String userPage() {
        return "Welcome to user page";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Welcome to admin page";
    }
}
