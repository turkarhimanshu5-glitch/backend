package net.javaguides.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Employee Management Backend is Running Successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is Healthy";
    }
}
