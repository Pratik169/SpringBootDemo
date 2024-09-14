package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld() {
        return "Hello World from Sring Boot";
    }

    @RequestMapping("/goodbye")
    public String goodBye() {
        return "Goodbye from Sprig boot";
    }
}
