package com.ankit.controller;

import com.ankit.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/welcome")
    public String welcomeMessage() {
        return helloService.welcomeService();
    }
}
