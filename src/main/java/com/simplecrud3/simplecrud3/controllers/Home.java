package com.simplecrud3.simplecrud3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class Home {

    @GetMapping
    public String getHome() {
        return "Selamat datang di Rest API Belajar";
    }
}