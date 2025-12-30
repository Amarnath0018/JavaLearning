package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class SampleClass {
    @GetMapping("/hello-world")
    public String helloWorldV1(){
        System.out.println("helloWorld method starts at "+ Instant.now());
        return "Hello World";
    }
}
