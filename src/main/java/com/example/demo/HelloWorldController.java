package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("#{@environment.getProperty('index.prefix')}test")
    private String test;

    @GetMapping("/")
    public String index() {
        return "Hello " + test;
    }
}
