package com.jade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayWelcome(){
        return  "Welcome to Jade Global by Manthan";
    }

    @GetMapping("/services")
    public String sayServices(){
        return  "Fullstack Development|Software Development";
    }
}
