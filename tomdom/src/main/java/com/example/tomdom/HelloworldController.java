package com.example.tomdom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController{

    @RequestMapping("/")
    String hello() {
        return "Hello World, Spring Boot!";
    }

}